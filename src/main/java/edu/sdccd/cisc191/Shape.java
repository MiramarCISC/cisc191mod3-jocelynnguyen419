package edu.sdccd.cisc191;

abstract class Shape {
    String name;

    Shape(String name){
        this.name = name;
    }

    abstract double area();
    abstract double perimeter();

    public String describe(){
        return "Shape: " + name;
    }
}