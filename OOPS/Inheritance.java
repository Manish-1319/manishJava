public class Inheritance {
    public static void main(String[] args) {
        Dog tommy = new Dog();    // 'tommy' is an object of 'Dog' inherits 'leg' property from 'Mammal and 'eat' property from 'Animal' 
        tommy.legs = 4;
        System.out.println(tommy.legs);
        tommy.eat();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Derived class
// class Mammal extends Animal  {
//     int legs;
// }

//Derived class
class Dog extends Animal  {
    int legs;
}