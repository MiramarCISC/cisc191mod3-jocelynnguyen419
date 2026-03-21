package edu.sdccd.cisc191;

class Circle extends Shape {

    private double radius;

    Circle(String name, double radius){
        super(name);

        if(radius <= 0){
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Circle)) return false;

        Circle other = (Circle) obj;
        return getName().equals(other.getName()) && Double.compare(radius, other.radius) == 0;
        // Better to use the getter to prevent compile-time error if name is private
    }

    // Removed toString due to method in Shape
}
