public class Triangle extends Shape {

    private int sideA, sideB, sideC;

    public Triangle(Point location, int sideA, int sideB, int sideC) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0) {
            this.sideA = 0;
            System.out.println("Side A must be a positive number");
        } else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B must be a positive number");
        } else {
            this.sideB = sideB;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC < 0) {
            this.sideC = 0;
            System.out.println("Side C must be a positive number");
        } else {
            this.sideC = sideC;
        }
    }

    @Override
    public double perimeter() {
        System.out.println("Shape class perimeter method : ");
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        System.out.println("Shape class area method : ");
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", location=" + getLocation() +
                '}';
    }
}