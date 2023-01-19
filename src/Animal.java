public abstract class Animal implements Speakable {
    private String name;
    private int box;
    private int speedRun;
    private int speedFly;
    private int speedSwim;

    public Animal(String name, int box, int speedRun, int speedFly, int speedSwim) {
        this.name = name;
        this.box = box;
        this.speedRun = speedRun;
        this.speedFly = speedFly;
        this.speedSwim = speedSwim;
    }

    @Override
    public String toString() {
        return String.format("name is %s;" + "\n" + "box num : %d;" + "\n" + "speed run: %d;" + "\n" + "speed fly: %d;" + "\n" + "speed swim: %d;", this.name, this.box, this.speedRun, this.speedFly, this.speedSwim);
    }

    public abstract String say();
}
