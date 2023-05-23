class Blowfish extends Animal implements AnimalBehavior, AnimalMove {
    public Blowfish() {
        super();
    }

    @Override
    public void soundKhamidov61421() {
        System.out.println("Blowfish makes bubbles");
    }

    @Override
    public String getNameKhamidov61421() {
        return "Blowfish";
    }
    @Override
    public void sleepkhamidov61421() {
        System.out.println("Blowfish sleeps");
    }

    @Override
    public void movekhamidov61421() {
        System.out.println("Blowfish swims");
    }
}