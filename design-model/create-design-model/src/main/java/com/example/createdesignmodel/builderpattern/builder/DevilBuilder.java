package com.example.createdesignmodel.builderpattern.builder;

/**
 * @author qzh
 * @Description: 恶魔建造者 - 具体建造者
 * @date 2024/1/11 22:04
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        System.out.println("devilType");
    }

    @Override
    public void buildSex() {
        System.out.println("devilSex");
    }

    @Override
    public void buildFace() {
        System.out.println("devilFace");
    }

    @Override
    public void buildCustom() {
        System.out.println("devilCustom");
    }

    @Override
    public void buildHairstyle() {
        System.out.println("devilHairstyle");
    }

    /**
     * 扩展-增加钩子方法
     * @return
     */
    public boolean noHair(){
        return true;
    }

}
