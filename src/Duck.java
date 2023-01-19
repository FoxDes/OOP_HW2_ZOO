public class Duck extends Animal implements Runable, Flyable, Swimming {

    public Duck(String name, int box, int speedRun, int speedFly, int speedSwim) {
        super(name, box, speedRun, speedFly, speedSwim);
    }

    @Override
    public String say() {
        return "says: Кря-кря" + "\n";
    }

    @Override
    public String toString() {
        return "Duck: " + "\n" + super.toString();
    }

    @Override
    public int speedOfFly() {
        return 90;
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfSwim() {
        return 40;
    }


}
