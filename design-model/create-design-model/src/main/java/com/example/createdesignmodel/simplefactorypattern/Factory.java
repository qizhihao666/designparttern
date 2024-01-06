package com.example.createdesignmodel.simplefactorypattern;

/**
 * @author qzh
 * @Description: 工厂类
 * @date 2024/1/6 18:11
 */
public class Factory {
    /**
     * 在一个面向对象软件系统中，与一个类相关的职责有三个
     * 1、对象本身所具有的职责
     * 2、创建对象的职责
     * 3、使用对象的职责
     *
     *  java中创建一个类实例的方式
     *  1、new关键字
     *  2、反射
     *  3、克隆
     *  4、工厂类创建
     */

    /**
     * 获取产品的静态方法
     * @param arg
     * @return
     */
    public static Product getProduct(String arg){
        if("A".equalsIgnoreCase(arg)){
            return new ConcreteProductA();
        }else if("B".equalsIgnoreCase(arg)){
            return new ConcreteProductB();
        }
        return null;
    }

}
