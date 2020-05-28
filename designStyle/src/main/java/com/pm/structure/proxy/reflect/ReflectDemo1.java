package com.pm.structure.proxy.reflect;
/**
 *  获取类对象，类加载器
 * @author
 *
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws Exception{
		//编译时已经确定会构建哪个类的对象
		//这个过程我们称为静态过程
		Point p1=new Point();//类的实例(类的对象)
	    
		//获取Point类的类对象
		Class<?> c1=p1.getClass();
		Class<?> c2=Point.class;
		//重点掌握如下类的加载方式
		Class<?> c3=Class.forName("com.pm.reflect.Point");
		System.out.println(c1);
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		//类加载时会有对应的加载器,如何找到此类的对应的类加载器？	
		ClassLoader loader=c3.getClassLoader();
		System.out.println(loader);//AppClassLoader
		
		ClassLoader pLoader=loader.getParent();
		System.out.println(pLoader);//ExtClassLoader
		
		ClassLoader ppLoader=pLoader.getParent();
		System.out.println(ppLoader);//BootStartClassLoader
		
		//各加载其的职责
		//1.BootstartClassLoader(jdk/jre/lib包中的jar文件)
		//2.ExtClassLoader(jdk/jre/lib/ext包中的jar文件)
		//3.AppClassLoader(自己写的类)
		//类加载器扩展：我们可以自己定义类加载器(继承ClassLoader)
		
		
		
	}
}
