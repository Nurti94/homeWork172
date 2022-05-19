package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape=new Triangle(3,3,3);
        System.out.println(shape.getPerimeter());
        Shape shape1=new Rectangle(6,6,3,3);
        System.out.println(shape1.getPerimeter());
        Shape shape2=new Diamond(6,6);
        System.out.println(shape2.getPerimeter());
        Shape shape3=new Square(4,4,4,4);
        System.out.println(shape3.getPerimeter());
        Shape shape4=new Cube(5,5,5,5);
        System.out.println(shape4.getPerimeter());


    }
}
