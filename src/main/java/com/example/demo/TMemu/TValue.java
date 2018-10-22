package com.example.demo.TMemu;

/**
 * @author zhai
 * @date 2018/9/16 12:14
 */
public enum TValue{

    TASK_ID(1,"第一个");

    private int id;
    private String name;

    TValue(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
