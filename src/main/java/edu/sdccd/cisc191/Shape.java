package edu.sdccd.cisc191;

abstract class Shape {
    String name;

    Shape(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name must not be empty");
        this.name = name;
    }
    //added null guard for shape

    abstract double area();
    abstract double perimeter();

    public String describe(){
        return "Shape: " + name;
    }
}