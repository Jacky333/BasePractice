package com.pm.concurrent;

import com.pm.concurrent.pojo.BankCard;

import java.util.concurrent.TimeUnit;

/**
 * @author pengcheng
 */
public class AtomicReferenceTest2 {
    private static volatile BankCard bankCard = new BankCard("cxuan",100);

    public static void main(String[] args) {

        for(int i = 0;i < 10;i++){
            new Thread(() -> {
                // 先读取全局的引用
                final BankCard card = bankCard;
                // 构造一个新的账户，存入一定数量的钱
                BankCard newCard = new BankCard(card.getAccountName(),card.getMoney() + 100);
                System.out.println(newCard);
                // 最后把新的账户的引用赋给原账户
                bankCard = newCard;
                try {
                    TimeUnit.MICROSECONDS.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
