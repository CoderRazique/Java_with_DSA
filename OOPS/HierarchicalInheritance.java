public class HierarchicalInheritance {
    public static void main(String[] args) {
        Fish sark = new Fish();
        sark.eat();
        sark.swim();

        Mammel mammal = new Mammel();
        mammal.breathe();
        mammal.walk();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims in water");
    }
}

class Mammel extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}