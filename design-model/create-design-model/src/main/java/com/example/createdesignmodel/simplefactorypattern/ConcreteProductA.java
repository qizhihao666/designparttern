package com.example.createdesignmodel.simplefactorypattern;

/**
 * @author qzh
 * @Description: 具体产品类A
 * @date 2024/1/6 18:09
 */
public class ConcreteProductA extends Product {

    @Override
    public void methodDiff() {
        System.out.println("这是A的方法");
    }
}
