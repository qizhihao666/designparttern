package com.example.createdesignmodel.abstractfactorypattern.factoryextendstructure;

import com.example.createdesignmodel.abstractfactorypattern.productextendstruact.*;

/**
 * @author qzh
 * @Description:具体工厂-夏天皮肤
 * @date 2024/1/9 7:49
 */
public class SummerSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComBox() {
        return new SummerComboBox();
    }
}
