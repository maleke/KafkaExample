package com.asanpardakht.kafkaExample.entity;

public class Greeting {
    private String msg;
    private String name;

    public Greeting() {
    }

    public Greeting(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public Greeting setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getName() {
        return name;
    }

    public Greeting setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "msg='" + msg + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
