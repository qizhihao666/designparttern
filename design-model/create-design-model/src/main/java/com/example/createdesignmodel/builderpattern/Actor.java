package com.example.createdesignmodel.builderpattern;

/**
 * @author qzh
 * @Description: 复杂产品
 * @date 2024/1/11 21:53
 */
public class Actor {
    /**
     *  类型
     */
    private String type;
    /**
     *  性别
     */
    private String sex;
    /**
     *  样貌
     */
    private String face;
    /**
     *  服饰
     */
    private String costume;
    /**
     *  发型
     */
    private String hairstyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
