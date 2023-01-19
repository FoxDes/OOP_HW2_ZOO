public class Fish extends Animal implements Swimming{

    public Fish(String name, int box, int speedRun, int speedFly, int speedSwim) {
        super(name, box, speedRun, speedFly, speedSwim);
    }

    @Override
    public String say() {

        return "says: Буль-Буль" + "\n";
    }

    @Override
    public String toString() {

        return "Fish: " + "\n" + super.toString();
    }

    @Override
    public int speedOfSwim() {

        return 50;
    }
}
