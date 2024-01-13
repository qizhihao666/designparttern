package com.example.createdesignmodel.builderpattern.builder;

/**
 * @author qzh
 * @Description: 英雄建造者 - 具体建造者
 * @date 2024/1/11 22:00
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        System.out.println("heroType");
    }

    @Override
    public void buildSex() {
        System.out.println("heroSex");
    }

    @Override
    public void buildFace() {
        System.out.println("heroFace");
    }

    @Override
    public void buildCustom() {
        System.out.println("heroCustom");
    }

    @Override
    public void buildHairstyle() {
        System.out.println("heroHairstyle");
    }


}
