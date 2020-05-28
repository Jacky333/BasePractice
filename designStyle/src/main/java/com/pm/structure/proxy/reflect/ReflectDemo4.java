package com.pm.structure.proxy.reflect;
/**
 * 通过类对象获得方法对象，给对象赋值
 */
import java.lang.reflect.Method;

public class ReflectDemo4 {
	public static void main(String[] args) throws Exception {
		Class<?> c1=Class.forName("com.pm.reflect.Teacher");
		Object obj1=c1.newInstance();
		//通过类对象获得方法对象
		Method m1=c1.getDeclaredMethod("setName", String.class);
		//执行方法对象(动态执行)
		//执行obj1对象的m1方法,传参为"小花"
		m1.invoke(obj1,"小花");

		Method m2=c1.getDeclaredMethod("getName");
		Object result=m2.invoke(obj1);
		System.out.println(result);
	}

}
