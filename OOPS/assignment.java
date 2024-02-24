import java.util.*;
public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the complex number:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        Complex add = new Complex();
        add.addition(x,y,a,b);
        Complex sub = new Complex();
        sub.subtraction(x,y,a,b);
        Complex mul = new Complex();
        mul.multiply(x,y,a,b);

    }
}

class Complex {
    void addition(int x, int y, int a, int b) {
        System.out.println((x+a) + " + " + (y+b) + "*i");
    }
    void subtraction(int x, int y, int a, int b) {
        System.out.println((x-a) + " + " + (y-b) + "*i");
    }
    void multiply(int x, int y, int a, int b) {
        System.out.println((x*a) + " + " + (y*b) + "*i");
    }
}

class Automobile {
    private String drive() {
    return "Driving vehicle";
    }
    }
    class Car extends Automobile {
    protected String drive() {
    return "Driving car";
    }
    }
    public class ElectricCar extends Car {
    @Override
    public final String drive() {
    return "Driving electric car";
    }
    public static void main(String[] wheels) {
    final Car car = new ElectricCar();
    System.out.print(car.drive());
    }
}