package com.pm.structure.protoType;

import java.text.MessageFormat;

/**
 * @Author: pengcheng
 * @Date: 2019/1/24 21:41
 * @Version 1.0
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent="向{0}同学,邮件地址:{1},邮件内容:{2}发送邮件";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getEmailAddress()));
    }

    public static void saveOriginalMailRecord(Mail mail){
        System.out.println("存储originalMail记录,originalMail:"+mail.getContent());
    }
}
