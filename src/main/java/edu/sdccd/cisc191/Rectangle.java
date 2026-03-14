package edu.sdccd.cisc191;

class Rectangle extends Shape implements Measurable {

    private double width;
    private double height;

    Rectangle(String name, double width, double height){
        super(name);

        if(width <= 0 || height <= 0){
            throw new IllegalArgumentException("Sides must be positive");
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }

    @Override
    public double perimeter(){
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Rectangle)) return false;

        Rectangle other = (Rectangle) obj;

        return Double.compare(width, other.width) == 0 &&
                Double.compare(height, other.height) == 0 &&
                name.equals(other.name);
    }

    @Override
    public String toString(){
        return "Rectangle(" + name + ", " + width + "x" + height + ")";
    }
}