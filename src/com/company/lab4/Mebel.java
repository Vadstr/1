package com.company.lab4;

public class Mebel {
    public String material = "дерево";
    public String name = "Defold";
    public double height = 1;
    public double width = 0.8;
    public double depth = 0.6;
    public Mebel (double h,double w, double d, String m,String n) {
        material=m;
        name= n;
        height=h;
        width=w;
        depth= d;
    }
}
