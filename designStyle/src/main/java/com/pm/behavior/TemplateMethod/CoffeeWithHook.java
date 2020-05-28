package com.pm.behavior.TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author pengcheng
 * @version V1.0
 * @description
 * @date 2019/04/03 17:20
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
    }

    @Override
    public boolean customerWantsCondiments() {
        if ("y".equals(getUserInput().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "n";
        }
        return answer;

    }
}
