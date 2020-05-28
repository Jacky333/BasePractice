package com.pm.behavior.vistor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengcheng
 * @version V1.0
 * @description 药单
 * @date 2019/04/03 18:04
 */
public class Presciption {
    List<Medicine> list = new ArrayList<Medicine>();

    public void accept(Visitor visitor){
        Iterator<Medicine> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine){
        list.add(medicine);
    }

    public void removeMedicien(Medicine medicine){
        list.remove(medicine);
    }
}
