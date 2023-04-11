package com.pm.concurrent;

import com.pm.concurrent.pojo.BankCard;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author pengcheng
 */
public class AtomicReferenceTest {
    private static AtomicReference<BankCard> bankCardAtomicRef = new AtomicReference<>(new BankCard("cxuan", 100));

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                while (true) {
                    final BankCard bankCard = bankCardAtomicRef.get();
                    BankCard newBankCard = new BankCard(bankCard.getAccountName(), bankCard.getMoney() + 100);

                    if (bankCardAtomicRef.compareAndSet(bankCard, newBankCard)) {
                        System.out.println(newBankCard);
                        break;
                    }
                }
            }).start();


        }
    }

}
