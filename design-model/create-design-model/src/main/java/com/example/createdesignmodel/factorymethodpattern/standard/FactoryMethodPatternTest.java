package com.example.createdesignmodel.factorymethodpattern.standard;

import com.example.createdesignmodel.factorymethodpattern.standard.logger.Logger;
import com.example.createdesignmodel.factorymethodpattern.standard.loggerfactory.LoggerFactory;
import com.example.createdesignmodel.utils.XMLUtil;

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
     *   工厂方法模式结构：
     *       1、抽象产品类
     *       2、具体产品类
     *       3、抽象工厂类
     *       4、具体工厂类
     *
     *    优势：
     *       1、用户只需关心所需产品对应的工厂，而无须关心创建细节
     *       2、符合开闭原则，在系统中加入新产品时，无须修改原来的代码，只需要新增加具体产品类和具体工厂类即可
     *    缺点：
     *       1、类的个数增加
     *       2、多个抽象层增加了理解成本
     *
     *      使用：通过直接new工厂类的方式创建产品对象。当需要一些复杂的初始化操作时，如数据库连接，网络连接等，可以将初始化操作放到具体工厂类
     */

    public static void main(String[] args) {
        //如想使用数据库日志记录器记录日志  如想更换日志记录器，只需要改变具体的工厂类即可，也可以通过反射的方式
        //将使用某个对象放入配置文件中
//        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
//        Logger logger = loggerFactory.getLogger();
//        logger.writeLog();
        LoggerFactory beanByXml = (LoggerFactory)XMLUtil.getBeanByXml("FactoryMethodXML.xml");
        Logger logger = beanByXml.getLogger();
        logger.writeLog();
    }

}
