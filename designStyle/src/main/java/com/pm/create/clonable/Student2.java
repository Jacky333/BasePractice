package com.pm.create.clonable;

import lombok.Data;

import java.io.*;

/**
 * @author pengcheng
 * @version V1.0
 * @description 深度克隆
 * @date 2019/04/22 14:22
 */
@Data
public class Student2 implements Serializable {

    private static final long serialVersionUID = -7237261210224278816L;

    private int number;

    private Score score;

    public Student2 myClone() {
        Student2 student2 = null;
        try { // 将该对象序列化成流,因为写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
//　　　　　　将流序列化成对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            student2 = (Student2) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student2;
    }
}
