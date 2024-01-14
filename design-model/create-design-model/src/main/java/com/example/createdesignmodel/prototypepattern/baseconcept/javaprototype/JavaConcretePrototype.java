package com.example.createdesignmodel.prototypepattern.baseconcept.javaprototype;

/**
 * @author qzh
 * @Description: 使用java的方式实现克隆
 *    1、所有java对象有一个共同父类 Object，该类中有一个方法 clone，可实现对象的克隆
 *    2、使用该方法的前提是，java对象必须实现 Cloneable 接口
 * @date 2024/1/14 8:01
 */
public class JavaConcretePrototype implements Cloneable {

    public JavaConcretePrototype clone(){
        Object cloneObj = null;
        try{
            // 浅拷贝
            cloneObj = super.clone();
        }catch (CloneNotSupportedException notSupportedException){
            System.out.println("error CloneNotSupportedException");
        }
        return (JavaConcretePrototype) cloneObj;
    }

}
