package com.example.createdesignmodel.abstractfactorypattern.factoryextendstructure;

import com.example.createdesignmodel.abstractfactorypattern.productextendstruact.*;

/**
 * @author qzh
 * @Description:具体工厂-春天皮肤
 * @date 2024/1/9 7:49
 */
public class SpringSkinFactory extends SkinFactory{

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComBox() {
        return new SpringComboBox();
    }
}
