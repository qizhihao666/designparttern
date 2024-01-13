package com.example.createdesignmodel.builderpattern.builder;

import com.example.createdesignmodel.builderpattern.Actor;

/**
 * @author qzh
 * @Description: 指挥者
 * @date 2024/1/11 22:05
 */
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder){
        //1、指挥者类可以自定义复杂产品对象的创建顺序，如下列顺序可根据需要调换
        actorBuilder.buildCustom();
        actorBuilder.buildFace();
        actorBuilder.buildSex();
        actorBuilder.buildType();

        //2、使用钩子函数
        if(!actorBuilder.noHair()){
            actorBuilder.buildHairstyle();
        }
        return actorBuilder.createActor();
    }






}
