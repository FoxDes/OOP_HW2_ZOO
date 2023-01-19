public class Cat extends Animal implements Runable{

    private String color;

    public Cat(String name, int box, String color, int speedRun, int speedFly, int speedSwim) {
        super(name, box, speedRun, speedFly, speedSwim);
        this.color = color;
    }
    @Override
    public String say() {
        return "says: Мяу" + "\n";
    }

    @Override
    public String toString() {
        return "Cat: " + "\n" + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 15;
    }


}
