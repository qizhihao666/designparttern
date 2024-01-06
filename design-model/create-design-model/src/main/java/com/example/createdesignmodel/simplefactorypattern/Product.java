package com.example.createdesignmodel.simplefactorypattern;

/**
 * @author qzh
 * @Description: 抽象产品类,可以是抽象类，也可以是接口
 * @date 2024/1/6 18:04
 */
public abstract class Product {

    // 所有产品类的公共方法
    public void commonMethod(){}

    //差异化方法，各实现类自己内部实现
    public abstract void methodDiff();

    public static void  a(){}
}
