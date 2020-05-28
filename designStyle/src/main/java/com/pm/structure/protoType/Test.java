package com.pm.structure.protoType;

/**
 * @Author: pengcheng
 * @Date: 2019/1/24 22:22
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        Mail tempMail = (Mail)mail.clone();
        for (int i = 0; i < 10; i++) {
            tempMail.setName("姓名:" + i);
            tempMail.setEmailAddress("姓名" + i + "@imooc.com");
            tempMail.setContent("恭喜您中奖了");
            MailUtil.sendMail(tempMail);
        }
        MailUtil.saveOriginalMailRecord(mail);
    }
}
