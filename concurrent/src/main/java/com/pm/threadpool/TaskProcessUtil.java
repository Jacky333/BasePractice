package com.pm.threadpool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.Map;
import java.util.concurrent.*;

/**
 * @author pengcheng
 */
public class TaskProcessUtil {
    // 每个任务，都有⾃自⼰己单独的线程池
    private static Map<String, ExecutorService> executors = new ConcurrentHashMap<>();

    //初始化一个线程池
    private static ExecutorService init(String poolName, int poolSize) {
        return new ThreadPoolExecutor(poolSize, poolSize,
                0L, TimeUnit.MICROSECONDS,
                new LinkedBlockingDeque<Runnable>(),
                new ThreadFactoryBuilder().setNameFormat("Pool-" + poolName).setDaemon(false).build(),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }

    //获取线程池
    public static ExecutorService getOrInitExecutors(String poolName, int poolSize) {
        ExecutorService executorService = executors.get(poolName);
        if (null == executorService) {
            synchronized (TaskProcessUtil.class) {
                executorService = executors.get(poolName);
                if (null == executorService) {
                    executorService = init(poolName, poolSize);
                    executors.put(poolName, executorService);
                }
            }
        }
        return executorService;
    }

    //回收线程池资源
    public static void releaseExecutors(String poolName) {
        ExecutorService executorService = executors.get(poolName);
        if (executorService != null) {
            executorService.shutdown();
        }
    }
}
