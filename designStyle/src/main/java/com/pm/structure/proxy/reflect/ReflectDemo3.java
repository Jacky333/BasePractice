package com.pm.structure.proxy.reflect;
/**
 * 通过类对象获得构造函数对象，然后创造该类的一个实例
 * 通过类对象获得该类的属性对象，通过将权限accessible改为true，就
 * 可以对私有属性的值进行更改。
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {
		Class<?> c1=Class.forName("com.pm.reflect.Student");
//        Object obj1=c1.newInstance();
		//通过类对象获得构造函数对象
		Constructor<?> con1=c1.getDeclaredConstructor(String.class);
		System.out.println(con1);
		//通过构造函数对象构建类的对象
		Object obj2=con1.newInstance("王梦");
		System.out.println(obj2);

		Constructor<?> con2=c1.getDeclaredConstructor(String.class,int.class);
		System.out.println(con2);
		Object obj3=con2.newInstance("小强",18);
		System.out.println(obj3);

		//通过反射获得对象属性
		Field f1=c1.getDeclaredField("name");
		//Field[] fs=c1.getDeclaredFields();
		//设置私有属性可以访问
		f1.setAccessible(true);
		//获得obj3对象的f1属性的值
		Object f1Value=f1.get(obj3);
		System.out.println(f1Value);
		//设置obj3对象的f1属性的值
		f1.set( obj3, "小花");
		f1Value=f1.get(obj3);
		System.out.println(f1Value);
	}
   
}
