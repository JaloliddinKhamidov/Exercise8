class Pigeon extends Animal implements AnimalBehavior, AnimalMove {
    public Pigeon() {
        super();
    }

    @Override
    public void soundKhamidov61421() {
        System.out.println("Pigeon coos");
    }

    @Override
    public String getNameKhamidov61421() {
        return "Pigeon";
    }

    @Override
    public void sleepkhamidov61421() {
        System.out.println("Pigeon sleeps");
    }

    @Override
    public void movekhamidov61421() {
        System.out.println("Pigeon flies");
    }
}