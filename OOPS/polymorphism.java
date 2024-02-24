public class polymorphism {
    public static void main(String[] args)  {
        int a=3, b=5, c=7;
        float d=4.6f, e=5.8f;
        Calculator calc = new Calculator();
        System.out.println(calc.sum(a,b));
        System.out.println(calc.sum(a,b,c));
        System.out.println(calc.sum(d,e));

        Dog tommy = new Dog();
        tommy.eat();
    }
}

// Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

//Method Overriding
class Animal {
    void eat() {
        System.out.println("eats");
    }
}

class Dog extends Animal  {
    void eat() {
        System.out.println("eats bread");
    }
}
