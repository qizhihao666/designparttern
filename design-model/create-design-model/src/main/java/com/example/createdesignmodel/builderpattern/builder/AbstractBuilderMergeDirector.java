package com.example.createdesignmodel.builderpattern.builder;

import com.example.createdesignmodel.builderpattern.Actor;

/**
 * @author qzh
 *
 * @Description: 抽象建造者- 指挥者类的省略 -  将构建复杂对象的抽象方法与构建顺序都放在抽象建造者中
 * @date 2024/1/13 8:21
 *   优点：省略了指挥者类
 *   缺点：加重了抽象建造者类的职责
 */
public abstract class AbstractBuilderMergeDirector {

    static Actor actor = new Actor();

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

    public static Actor createActor(AbstractBuilderMergeDirector abstractBuilderMergeDirector){
        abstractBuilderMergeDirector.buildFace();
        abstractBuilderMergeDirector.buildCustom();
        abstractBuilderMergeDirector.buildHairstyle();
        abstractBuilderMergeDirector.buildSex();
        abstractBuilderMergeDirector.buildType();
        return actor;
    }


}
