package com.example.createdesignmodel.prototypepattern.exampleprototypepattern.prototypemanager;

import java.util.Hashtable;

/**
 * @author qzh
 * @Description: 原型管理器，可以同时管理多个原型，该管理器可以使用单例模式，节省内存资源
 * @date 2024/1/14 8:57
 */
public class PrototypeManager {

    public Hashtable<String,AbstractPrototype> hashtable = new Hashtable<>();

    {
        hashtable.put("A",new ConcretePrototypeA());
        hashtable.put("B",new ConcretePrototypeB());
    }

    public AbstractPrototype getPrototype(String key){
        AbstractPrototype abstractPrototype = hashtable.get(key);
        return abstractPrototype.cloneMethod();
    }
}
