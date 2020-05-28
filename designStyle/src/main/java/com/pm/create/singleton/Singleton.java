package com.pm.create.singleton;

import java.io.Serializable;

/**
 * @author pengcheng
 * @version V1.0
 * @description 单例类
 * @date 2019/05/14 19:31
 */
public class Singleton implements Serializable {
    private static final long serialVersionUID = 3802508232485556007L;
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    /**
     * 序列化可以破坏单例,在Singleton类中定义readResolve就可以解决该问题
     */
    private Object readResolve() {
        return singleton;
    }
}
