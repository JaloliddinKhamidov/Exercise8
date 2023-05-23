public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Pigeon();
        animals[2] = new Blowfish();

        for (Animal animal : animals) {
            animal.soundKhamidov61421();
            animal.sleepKhamidov61421();
            if (animal instanceof AnimalMove) {
                ((AnimalMove) animal).movekhamidov61421();
            }
            if (animal instanceof AnimalName) {
                String name = animal.getNameKhamidov61421();
                AnimalName.namekhamidov61421(name);
            }
            System.out.println();
        }
    }
}
interface AnimalBehavior {
    default void sleepkhamidov61421() {

    }
}

interface AnimalMove {
    default void movekhamidov61421() {
        System.out.println("Animal moves");
    }
}

interface AnimalName {
    static void namekhamidov61421(String name) {
        System.out.println("Name: " + name);
    }
}