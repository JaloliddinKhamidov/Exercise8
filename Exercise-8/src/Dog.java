class Dog extends Animal implements AnimalBehavior, AnimalMove {
    public Dog() {
        super();
    }
    @Override
    public void soundKhamidov61421() {
        System.out.println("Dog barks");
    }

    @Override
    public String getNameKhamidov61421() {
        return "Dog";
    }

    @Override
    public void sleepkhamidov61421() {
        System.out.println("Dog sleeps");
    }

    @Override
    public void movekhamidov61421() {
        System.out.println("Dog runs");
    }
}