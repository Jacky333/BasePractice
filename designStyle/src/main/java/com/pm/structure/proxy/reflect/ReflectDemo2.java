package com.pm.structure.proxy.reflect;
/**
 * 输入一个类名得到该类的一个实例
 */
import java.util.Scanner;

public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		System.out.println("please input your class");
		Scanner scan=new Scanner(System.in);
        String className=scan.nextLine();
        //根据输入的类名构建对象
        Class<?> c1=Class.forName(className);
        Object obj=c1.newInstance();
        System.out.println(obj);
        scan.close();
	}
}
