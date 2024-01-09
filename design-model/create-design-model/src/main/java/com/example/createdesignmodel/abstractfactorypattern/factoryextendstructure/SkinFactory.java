package com.example.createdesignmodel.abstractfactorypattern.factoryextendstructure;

import com.example.createdesignmodel.abstractfactorypattern.productextendstruact.Button;
import com.example.createdesignmodel.abstractfactorypattern.productextendstruact.ComboBox;
import com.example.createdesignmodel.abstractfactorypattern.productextendstruact.TextField;

/**
 * @author qzh
 * @Description:抽象工厂
 * @date 2024/1/9 7:45
 */
public abstract class SkinFactory {
    // 也可以加重载方法，用于接收参数，根据参数创建对象，如做一些类的初始化操作等
    public abstract Button createButton();
//    public abstract Button createButton(String url);
//    public abstract Button createButton(Object obj);

    public abstract TextField createTextField();

    public abstract ComboBox createComBox();

}
