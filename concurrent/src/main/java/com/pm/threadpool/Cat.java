package com.pm.threadpool;

import lombok.Data;

@Data
public class Cat {
    private String catName;
    public Cat setCatName(String name) {
        this.catName = name;
        return this;
    }
}

