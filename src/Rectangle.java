import javax.management.ValueExp;
import java.security.PublicKey;

public class Rectangle extends Shape {

    private int sideA, sideB;

    public Rectangle(Point location, int sideA, int sideB){
        super(location);
        setSideA(sideA);
        setSideB(sideB);
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

    @Override
    public double perimeter(){
        System.out.println("Shape Class perimeter Method :");
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public double area(){
        System.out.println("shape class Area method :");
        return sideA * sideB;
    }

    @Override
    public String toString(){
        return "Rectangle{" +
                "sideB=" + this.sideB +
                ", sideA=" + this.sideA +
                ", location=" + this.getLocation() +
                '}';
    }
}