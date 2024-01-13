package com.example.createdesignmodel.builderpattern.builder;

/**
 * @author qzh
 * @Description: 天使建造者 - 具体建造者
 * @date 2024/1/11 22:02
 */
public class AngelBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        System.out.println("angelType");
    }

    @Override
    public void buildSex() {
        System.out.println("angelSex");
    }

    @Override
    public void buildFace() {
        System.out.println("angelFace");
    }

    @Override
    public void buildCustom() {
        System.out.println("angelCustom");
    }

    @Override
    public void buildHairstyle() {
        System.out.println("angelHairstyle");
    }
}
