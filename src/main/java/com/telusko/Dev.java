package com.telusko;

public class Dev {

    private Computer com;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Computer getCom() {
        return com;
    }

    public void build() {
        com.compile();
        System.out.println("Working on Awesome Project");
    }
}
