package com.example.createdesignmodel.builderpattern;

import com.example.createdesignmodel.builderpattern.builder.ActorController;
import com.example.createdesignmodel.builderpattern.builder.DevilBuilder;

/**
 * @author qzh
 * @Description:
 * @date 2024/1/11 22:25
 */
public class BuilderPatternTest {
    /**
     *  建造者模式
     *     定义：将一个复杂对象的构建和它的表示分离，使得同样的构建过程可以创建不同的表示（这里指使用指挥者时构建的顺序不同）
     *     核心：如何一步步构建一个包含多个组成部件的复杂对象，使用相同的构建过程构建不同的产品
     *     角色：
     *          抽象建造者：复杂产品的抽象建造过程
     *          具体建造者：复杂产品的具体建造过程
     *          复杂产品对象：要返回的产品
     *          指挥者：负责安排复杂产品的建造顺序，与抽象建造者之间是关联关系
     *
     *      优势：
     *          1、对象的构建和使用分离
     *          2、使用不同的建造者可以得到不同的对象
     *          3、精准的控制类的创建过程
     *
     *      缺点：
     *          1、使用范围受限，要求所创建的对象有很多的共同点，差异较大的对象不适合使用建造者模式
     *          2、如果产品的内部变化复杂，可能会导致需要定义很多的具体建造者类实现
     */
    public static void main(String[] args) {
       ActorController actorController = new ActorController();
        Actor construct = actorController.construct(new DevilBuilder());

    }

}
