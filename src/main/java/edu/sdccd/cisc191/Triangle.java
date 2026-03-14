package edu.sdccd.cisc191;

class Triangle extends Shape implements Measurable {

    private double a, b, c;

    Triangle(String name, double a, double b, double c){
        super(name);

        if(a <= 0 || b <= 0 || c <= 0){
            throw new IllegalArgumentException("Sides must be positive");
        }

        if(a + b <= c || a + c <= b || b + c <= a){
            throw new IllegalArgumentException("Invalid triangle");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area(){
        double s = perimeter() / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double perimeter(){
        return a + b + c;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Triangle)) return false;

        Triangle other = (Triangle) obj;

        return Double.compare(a, other.a) == 0 &&
                Double.compare(b, other.b) == 0 &&
                Double.compare(c, other.c) == 0 &&
                name.equals(other.name);
    }

    @Override
    public String toString(){
        return "Triangle(" + name + ")";
    }
}