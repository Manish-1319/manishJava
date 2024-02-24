public class abstraction {
    public static void main(String[] args) {
        // Animal a = new Animal();   // Cannot instantiate the type Animal

        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // Mustang myHorse = new Mustang();    // Constructor calling (Base class --> Derived class --> Derived class)
        
        Queen q = new Queen();
        q.moves();

        // Bear b = new Bear();
        // b.eatsGrass();
        // b.eatsMeat(); 
    }
}

                    // Abstract class

abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
    // Non-abstract method
    void eat() {    
        System.out.println("animal eats");
    }

    // Abstract method
    abstract void walk();    // It's implementation is compulsory to every derived class of class 'Animal'
}

class Horse extends Animal {    // The type horse must implement the inherited abstract method Animal.walk()
    Horse() {
        System.out.println("Horse constructor called");
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

                    // Interface

interface ChessPlayer {
    void moves();
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, digonal - by 1 step");
    }
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, digonal");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

                    //Multiple Inheritance using Interfaces

interface Herbivore {
    void eatsGrass();
}

interface Carnivore {
    void eatsMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatsGrass() {
        System.out.println("eats grass");
    }
    public void eatsMeat() {
        System.out.println("eats meat");
    }
}   