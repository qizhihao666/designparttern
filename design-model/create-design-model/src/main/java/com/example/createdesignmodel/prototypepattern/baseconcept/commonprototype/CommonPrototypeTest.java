package com.example.createdesignmodel.prototypepattern.baseconcept.commonprototype;

/**
 * @author qzh
 * @Description: 通用方式实现克隆
 * @date 2024/1/14 7:54
 */
public class CommonPrototypeTest {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName("thisName");
        //父类不可以调用子类独有的方法，故此处需要强转
        ConcretePrototype clone = (ConcretePrototype)concretePrototype.clone();
        System.out.println(clone == concretePrototype);
        // false
        System.out.println(clone.getName() == concretePrototype.getName());
        // true
    }

}
