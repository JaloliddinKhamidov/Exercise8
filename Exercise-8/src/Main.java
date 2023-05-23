class Dog extends Animal implements AnimalBehavior, AnimalMove {
    public Dog() {
        super();
    }
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}

class Pigeon extends Animal implements AnimalBehavior, AnimalMove {
    public Pigeon() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("Pigeon coos");
    }

    @Override
    public String getName() {
        return "Pigeon";
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon sleeps");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies");
    }
}
class Blowfish extends Animal implements AnimalBehavior, AnimalMove {
    public Blowfish() {
        super();
    }

    @Override
    public void sound() {
        System.out.println("Blowfish makes bubbles");
    }

    @Override
    public String getName() {
        return "Blowfish";
    }
    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims");
    }
}

interface AnimalBehavior {
    void sleep();
}

interface AnimalMove {
    default void move() {
        System.out.println("Animal moves");
    }
}

interface AnimalName {
    static void name(String name) {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Pigeon();
        animals[2] = new Blowfish();

        for (Animal animal : animals) {
            animal.sound();
            animal.sleep();
            if (animal instanceof AnimalMove) {
                ((AnimalMove) animal).move();
            }
            if (animal instanceof AnimalName) {
                String name = animal.getName();
                AnimalName.name(name);
            }
            System.out.println();
        }
    }
}
