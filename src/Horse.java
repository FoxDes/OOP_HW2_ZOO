public class Horse extends Animal implements Runable {

    public Horse(String name, int box, int speedRun, int speedFly, int speedSwim) {
        super(name, box, speedRun, speedFly, speedSwim);
    }

    @Override
    public String say() {

        return "says: И-го-го" + "\n";
    }

    @Override
    public String toString() {
        return "Horse: " + "\n" + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 60;
    }
}
