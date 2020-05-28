package com.pm.spring.ioc.modules;


import com.pm.spring.ioc.pojo.Car;
import com.pm.spring.ioc.pojo.Wheel;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/08/06 19:05
 */
public class Test {
    public static void main(String[] args) throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
