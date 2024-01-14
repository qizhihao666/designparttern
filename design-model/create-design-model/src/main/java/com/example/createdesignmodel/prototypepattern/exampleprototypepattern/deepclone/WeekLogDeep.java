package com.example.createdesignmodel.prototypepattern.exampleprototypepattern.deepclone;

import com.example.createdesignmodel.prototypepattern.exampleprototypepattern.shallowclone.AttachmentShallow;

import java.io.*;

/**
 * @author qzh
 * @Description:
 * @date 2024/1/14 8:24
 */
public class WeekLogDeep implements Serializable {

     private String name;

     private String date;

     private String context;

     private AttachmentDeep attachmentDeep;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public AttachmentDeep getAttachmentDeep() {
        return attachmentDeep;
    }

    public void setAttachmentDeep(AttachmentDeep attachmentDeep) {
        this.attachmentDeep = attachmentDeep;
    }

    // 使用流的方式实现深拷贝
    public WeekLogDeep deepClone() {
        Object cloneObj = null;
        try {
            ByteArrayOutputStream byos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(byos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(byos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            cloneObj = ois.readObject();
        } catch (IOException | ClassNotFoundException  e) {
            e.printStackTrace();
        }
        //是否需要强转需要看，拷贝出来的对象如何使用，
        // 如直接返回给前端，则不用强转，并使用浅拷贝即可，
        // 如果需要获取其属性，则需要强转，因为父类无法调用子类独有的方法
        return (WeekLogDeep)cloneObj;
    }
}
