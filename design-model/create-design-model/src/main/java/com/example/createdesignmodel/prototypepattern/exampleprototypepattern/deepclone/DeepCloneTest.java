package com.example.createdesignmodel.prototypepattern.exampleprototypepattern.deepclone;

import com.example.createdesignmodel.prototypepattern.exampleprototypepattern.shallowclone.WeekLogShallow;

/**
 * @author qzh
 * @Description: 深拷贝测试类
 * @date 2024/1/14 8:44
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        WeekLogDeep weekLogDeep = new WeekLogDeep();
        weekLogDeep.setName("weekLogName");
        weekLogDeep.setDate("weekLogDate");
        weekLogDeep.setContext("weekLogContext");
        AttachmentDeep attachmentDeep = new AttachmentDeep();
        attachmentDeep.setName("attachmentName");
        weekLogDeep.setAttachmentDeep(attachmentDeep);

        WeekLogDeep cloneObj = weekLogDeep.deepClone();
        System.out.println(cloneObj == weekLogDeep);
        // false
        System.out.println(cloneObj.getAttachmentDeep() == weekLogDeep.getAttachmentDeep());
        // false
    }

}
