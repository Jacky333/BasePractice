package com.pm.create.clonable;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/04/22 11:56
 */

/**
 * 简单来说，在浅克隆中，当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制。
 * 在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，深克隆将原型对象的所有引用对象也复制一份给克隆对象。
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setNumber(12345);
        Score score = new Score("语文",60D);
        stu1.setScore(score);
        Student stu2 = (Student)stu1.clone();

        System.out.println("学生1:" + stu1);
        System.out.println("学生2:" + stu2);

        stu2.setNumber(54321);
        score.setScoreNumber(80D);

        System.out.println("学生1:" + stu1);
        System.out.println("学生2:" + stu2);

        System.out.println("----------------------------分割线-------------------------------------");
        Student2 stu3 = new Student2();
        stu3.setNumber(12345);
        Score score2 = new Score("语文",60D);
        stu3.setScore(score2);
        Student2 stu4 = stu3.myClone();

        System.out.println("学生3:" + stu3);
        System.out.println("学生4:" + stu4);

        stu4.setNumber(54321);
        score2.setScoreNumber(80D);

        System.out.println("学生3:" + stu3);
        System.out.println("学生4:" + stu4);
    }

}
