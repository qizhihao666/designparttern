package com.example.createdesignmodel.simplefactorypattern;

/**
 * @author qzh
 * @Description: 简单工厂模式测试类
 * @date 2024/1/6 18:14
 */
public class SimpleFactoryPatternTest {
    /**
     *   简单工厂模式：
     *       定义一个工厂类，它可以根据不同的入参返回不同的实例，被创建的实例通常由共同的父类
     *
     *    简单工厂模式结构：
     *         1、抽象产品角色（接口/抽象类）
     *         2、具体产品角色
     *         3、工厂角色
     *
     *   优点：
     *       1、对象的创建和使用分离
     *       2、一定程度提高了系统的灵活性（通过配置文件切换不同参数，返回不同实例）
     *    缺点：
     *       1、如果新增加具体产品，需要修改工厂类中的方法，违反了开闭原则
     * @param args
     */
    public static void main(String[] args) {
        Product a = Factory.getProduct("C");
        a.methodDiff();
    }

}
