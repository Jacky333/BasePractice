package com.pm.behavior.TemplateMethod;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/04/03 17:22
 */
public class Test {
    public static void main(String[] args) {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        coffeeHook.prepareRecipe();
    }
}
