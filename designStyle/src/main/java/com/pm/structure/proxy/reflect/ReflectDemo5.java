package com.pm.structure.proxy.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo5 {
      public static void main(String[] args) throws Exception{
    	  List<String> list=new ArrayList<String>();
    	  list.add("A");
    	  list.add("B");
//    	  list.add(100);
    	  
    	  Class<?> c=list.getClass();
    	  Method m=c.getDeclaredMethod("add",Object.class);
	      Object o=m.invoke(list, 100);
	      System.out.println(o);
	      System.out.println(list);
}
}
