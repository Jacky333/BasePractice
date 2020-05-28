package com.pm.structure.proxy.reflect;

import lombok.Data;

/**
 * @Author:
 * @Date:
 * @Version
 */
@Data
public class Teacher {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
