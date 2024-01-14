package com.example.createdesignmodel.prototypepattern.exampleprototypepattern.shallowclone;

/**
 * @author qzh
 * @Description:
 * @date 2024/1/14 8:24
 * extends Object implements Cloneable
 */
public class WeekLogShallow implements Cloneable {

     private String name;

     private String date;

     private String context;

     private AttachmentShallow attachmentShallow;

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

    public AttachmentShallow getAttachmentShallow() {
        return attachmentShallow;
    }

    public void setAttachmentShallow(AttachmentShallow attachmentShallow) {
        this.attachmentShallow = attachmentShallow;
    }

    public WeekLogShallow clone(){
        Object cloneObj = null;
        try{
            // Object类中的方法，clone为浅拷贝
            cloneObj = super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("error CloneNotSupportedException");
        }
        return (WeekLogShallow)cloneObj;
    }
}
