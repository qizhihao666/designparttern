package com.example.createdesignmodel.builderpattern.builder;

import com.example.createdesignmodel.builderpattern.Actor;

/**
 * @author qzh
 * @Description:抽象建造者
 * @date 2024/1/11 21:57
 */
public abstract class ActorBuilder {

    Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCustom();
    public abstract void buildHairstyle();

    /**
     * 扩展-增加钩子方法
     * @return
     */
    public boolean noHair(){
        return false;
    }

    public Actor createActor(){
        return actor;
    }



}
