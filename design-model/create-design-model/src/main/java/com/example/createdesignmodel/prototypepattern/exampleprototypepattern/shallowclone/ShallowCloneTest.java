package com.example.createdesignmodel.prototypepattern.exampleprototypepattern.shallowclone;

/**
 * @author qzh
 * @Description: 浅拷贝测试
 * @date 2024/1/14 8:30
 */
public class ShallowCloneTest {

    public static void main(String[] args) {
        WeekLogShallow weekLogShallow = new WeekLogShallow();
        weekLogShallow.setName("weekLogName");
        weekLogShallow.setDate("weekLogDate");
        weekLogShallow.setContext("weekLogContext");
        AttachmentShallow attachmentShallow = new AttachmentShallow();
        attachmentShallow.setName("attachmentName");
        weekLogShallow.setAttachmentShallow(attachmentShallow);

        WeekLogShallow cloneObj = weekLogShallow.clone();
        System.out.println(cloneObj == weekLogShallow);
        // false
        System.out.println(cloneObj.getAttachmentShallow() == weekLogShallow.getAttachmentShallow());
        // true
    }
}
