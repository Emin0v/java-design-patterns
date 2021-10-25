package com.company;

public enum EnumSingleton {

    INSTANCE("EnumSingleton info");

    private String info;

    private EnumSingleton(String info){
        this.info = info;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
