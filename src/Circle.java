public class Circle extends Shape {

    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        setRadius(radius);
    }

    public Point getCenter() {
        return getLocation();
    }

    public void setCenter(Point center) {
        setLocation(center);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            System.out.println("Radius can't be negative");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public String toString(){
        return "Circle{" +
                "center=" + this.getLocation() +
                ", radius=" + this.radius +
                '}';
    }

    @Override
    public double area() {
        System.out.println("Shape class area method : ");
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter(){
        System.out.println("Shape class perimeter method : ");
        return 2 * Math.PI * this.radius;
    }
}
