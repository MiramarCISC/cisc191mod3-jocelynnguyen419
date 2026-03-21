package edu.sdccd.cisc191;
import java.util.Objects;
class Circle extends Shape implements Measurable {

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
        return Double.compare(radius, other.radius) == 0 &&
                name.equals(other.name);
    }

    @Override
    public String toString(){
        return "Circle(" + name + ", r=" + radius + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }
}