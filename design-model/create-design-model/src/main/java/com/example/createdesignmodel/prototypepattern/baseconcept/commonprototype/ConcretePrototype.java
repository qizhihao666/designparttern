package com.example.createdesignmodel.prototypepattern.baseconcept.commonprototype;

/**
 * @author qzh
 * @Description: 具体原型类
 * @date 2024/1/14 7:49
 */
public class ConcretePrototype extends Prototype {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        //因为引用类型name采用的赋值的方式，故当前这种方式为浅拷贝
        // （如要实现深拷贝，只需将引用类型的属性，重新赋值新的地址即可，
        // 如  String nameStr = this.name;
        // concretePrototype.setName(nameStr)）
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
