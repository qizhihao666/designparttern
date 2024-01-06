package com.example.createdesignmodel.factorymethodpattern;

import com.example.createdesignmodel.factorymethodpattern.logger.Logger;
import com.example.createdesignmodel.factorymethodpattern.loggerfactory.DatabaseLoggerFactory;
import com.example.createdesignmodel.factorymethodpattern.loggerfactory.LoggerFactory;

/**
 * @author qzh
 * @Description: 工厂方法模式测试类
 * @date 2024/1/6 19:09
 */
public class FactoryMethodPatternTest {

    /**
     *  工厂方法模式：
     *      定义一个用于创建对象的接口，但是让子类决定哪一个类实例化（new 一个子类对象）。工厂方法模式让一个类的实例化延迟到其子类。
     *      （在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，而工厂子类负责生成具体的产品对象，这样做的目的是将产品类的实例化操作延迟到工厂子类中完成，即通过工厂子类来确定究竟应该
     *      实例化哪一个具体产品类。）
     *
     *
     */

    public static void main(String[] args) {
        //如想使用数据库日志记录器记录日志
        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
        Logger logger = loggerFactory.getLogger();
        logger.writeLog();
    }

}
