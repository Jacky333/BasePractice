package com.pm.concurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pengcheng
 * @version V1.0
 * @description Fork/Join框架
 * @date 2020/10/20 19:53
 */
public class ForkJoinTask extends RecursiveTask<Long> {
    public static AtomicInteger count = new AtomicInteger(0);
    public static int countNum = 0;
    private static final long MAX = 1000000000L;
    private static final long THRESHOLD = 1000L;
    private long start;
    private long end;

    public ForkJoinTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        test();
        System.out.println("--------------------");
        testForkJoin();
    }

    private static void testForkJoin() {
        System.out.println("testForkJoin");
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Long sum = forkJoinPool.invoke(new ForkJoinTask(1, MAX));
        System.out.println("count:" + count.get());
        System.out.println("countNum:" + countNum);
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    private static void test() {
        System.out.println("test");
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0L; i <= MAX; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start + "ms");
        System.out.println(count.get());
    }

    @Override
    protected Long compute() {
        long sum = 0;
        if (end - start <= THRESHOLD) {
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            count.incrementAndGet();
            countNum++;
            long mid = (start + end) / 2;
            ForkJoinTask task1 = new ForkJoinTask(start, mid);
            task1.fork();

            ForkJoinTask task2 = new ForkJoinTask(mid + 1, end);
            task2.fork();
            return task1.join() + task2.join();
        }
    }
}
