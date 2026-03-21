package edu.sdccd.cisc191;

abstract class Shape implements Measurable, Comparable<Shape> {
    /*
    Implement Mesurable here to not need to in each subclass
    Implement Comparable to allow a class to define how it can be ordered and sorted via compareTo
    */
    String name;

    Shape(String name){
        if (name == null || name.trim().isBlank()) {
            throw new IllegalArgumentException("Shape name is null or empty"); // Make sure to catch invalid names
        }
        this.name = name;
    }

    abstract double area();
    abstract double perimeter();

    public String describe(){ // I would personally put more information for the describe but this works fine
        return "Shape: " + name;
    }

    @Override
    public String toString() { // You can override Shape directly to prevent excessive extra overriding/implementation in the child classes
        return String.format(
                "%s - '%s' - %.3f",
                getClass().getSimpleName(), name, area()
        );
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Shape other) { // Have to override compareTo due to implementation of Comparable
        return this.getName().compareTo(other.getName());
    }
}
