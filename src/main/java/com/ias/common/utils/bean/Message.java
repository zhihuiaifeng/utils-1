package com.ias.common.utils.bean;

/**
 * 留言
 */
public class Message {
    public Message(Integer id, String name, String body) {
        this.id = id;
        this.name = name;
        this.body = body;
    }

    public Message() {
    }

    @Override
    public String toString() {
        return "Message" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", body='" + body + '\''
                ;
    }

    private Integer id;//id
    private String name;//游客显示为ip地址
    private String body;//留言内容

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
