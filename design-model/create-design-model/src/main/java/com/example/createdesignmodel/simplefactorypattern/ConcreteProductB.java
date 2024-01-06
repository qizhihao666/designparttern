package com.example.createdesignmodel.simplefactorypattern;

/**
 * @author qzh
 * @Description: 具体产品类B
 * @date 2024/1/6 18:10
 */
public class ConcreteProductB extends Product{
    @Override
    public void methodDiff() {
        System.out.println("这是B的方法");
    }
}
