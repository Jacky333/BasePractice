package com.pm.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * 如果try中没有异常，则顺序为try→finally，如果try中有异常，则顺序为try→catch→finally。
 * 当try中有return，先执行try，然后执行finally，最后在try中return。如果返回值是基本类型，返回的数值就是执行finally操作前的值，如果是引用类型，返回值就是执行finally后的值。
 * 当try中有return，catch有return，当有异常的时候，先执行try，在执行catch，然后执行return，最后catch有return；
 * 当finally中共有return，按照try→catch→finally执行，最后在finally中return。
 * @date 2021/03/13 09:53
 */
public class TryCatchFinally {

    public static void main(String[] args) {
//        int i = testReturn1();
//        System.out.println("result:" + i);

//        List<Integer> list = testReturn2();
//        System.out.println(list);

//        int i = testReturn3();
//        System.out.println("result:" + i);

        int i = testReturn4();
        System.out.println("result:" + i);
    }

    private static int testReturn1() {
        int i = 1;
        try {
            i++;
            System.out.println("try:" + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch:" + i);
        } finally {
            i++;
            System.out.println("finally:" + i);
        }
        return i;
    }

    private static List<Integer> testReturn2() {
        List<Integer> list = new ArrayList<>();
        try {
            list.add(1);
            System.out.println("try:" + list);
            return list;
        } catch (Exception e) {
            list.add(2);
            System.out.println("catch:" + list);
        } finally {
            list.add(3);
            System.out.println("finally:" + list);
        }
        return list;
    }

    private static int testReturn3() {
        int i = 1;
        try {
            i++;
            System.out.println("try:" + i);
            int x = i / 0;
        } catch (Exception e) {
            i++;
            System.out.println("catch:" + i);
            return i;
        } finally {
            i++;
            System.out.println("finally:" + i);
        }
        return i;
    }

    private static int testReturn4() {
        int i = 1;
        try {
            i++;
            System.out.println("try:" + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch:" + i);
            return i;
        } finally {
            i++;
            System.out.println("finally:" + i);
            return i;
        }
    }
}
