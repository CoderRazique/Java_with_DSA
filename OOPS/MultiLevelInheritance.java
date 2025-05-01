public class MultiLevelInheritance {

    public static void main(String[] args) {
        Dog dubbu = new Dog();
        dubbu.eat();
        dubbu.legs = 4;
        System.out.println(dubbu.legs);
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

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    int legs;
}
