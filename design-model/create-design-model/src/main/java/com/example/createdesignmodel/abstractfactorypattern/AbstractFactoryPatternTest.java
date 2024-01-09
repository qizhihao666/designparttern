package com.example.createdesignmodel.abstractfactorypattern;

import com.example.createdesignmodel.abstractfactorypattern.factoryextendstructure.SkinFactory;
import com.example.createdesignmodel.abstractfactorypattern.factoryextendstructure.SpringSkinFactory;
import com.example.createdesignmodel.abstractfactorypattern.productextendstruact.SpringTextField;
import com.example.createdesignmodel.abstractfactorypattern.productextendstruact.TextField;

/**
 * @author qzh
 * @Description:
 * @date 2024/1/9 7:51
 */
public class AbstractFactoryPatternTest {
    /**
     *  抽象工厂模式
     *     定义：提供一个创建一系列相关或相互依赖的接口，而无须指定它们具体的类（无须指定具体的产品类，但须指定具体的产品工厂类）
     *     角色：
     *          抽象工厂角色
     *          具体工厂角色
     *          抽象产品角色
     *          具体产品角色
     *      优势：
     *          1、一个产品工厂类可以创建一个产品族，相对于工厂方法模式的一个工厂类只能创建一个产品，大大减少了工厂类的数量
     *          2、如果需要新增加产品族，无须修改之前的代码，符合开闭原则
     *      劣势：
     *          1、如果需要新增加产品等级结构，需修改之前的产品工厂，增加新的产品等级结构
     *
     *      既有优势又有劣势：此设计模式的使用要考虑开闭原则的倾斜性，即某一方面满足开闭原则。
     *
     *      产品族：一系列的产品   如：冰箱  洗衣机  空调 等
     *      产品等级结构：不同品牌的相同产品    如：海尔冰箱   海信冰箱  美的冰箱 等
     *
     */
    public static void main(String[] args) {
        // 工厂类对象可以通过配置文件，映射的方式动态获取
        SkinFactory skinFactory = new SpringSkinFactory();
        skinFactory.createButton().displayButton();
        skinFactory.createComBox().displayComboBox();
        //如果将抽象产品类的方法可见范围修改为protected，则不能再用抽象产品类接收对象，只能使用具体的产品类
        SpringTextField textField = new SpringTextField();
        textField.displayTextField();
    }
}
