import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;

    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal(Animal a) {
        animals.add(a);
        return this;
    }

    public List<Speakable> getSpeakables() {
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an : animals) {
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable> getRunner() {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable) an);
            }
        }
        return result;

    }

    public List<Flyable> getFlyers() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable) an);
            }
        }
        return result;
    }

    public List<Swimming> getSwim() {
        List<Swimming> result = new ArrayList<Swimming>();
        for (Animal an : animals) {
            if (an instanceof Swimming) {
                result.add((Swimming) an);
            }
        }
        return result;
    }

    public int getChampionOfSwim() {
        int speedMaxSwim = 0;
        for (Swimming swim : getSwim()) {
            if (speedMaxSwim < swim.speedOfSwim()) {
                speedMaxSwim = swim.speedOfSwim();
            }
        }
        return speedMaxSwim;
    }

    public int getChampionOfFlyers() {
        int speedMaxFly = 0;
        for (Flyable speedFly : getFlyers()) {
            if (speedMaxFly < speedFly.speedOfFly()) {
                speedMaxFly = speedFly.speedOfFly();
            }
        }
        return speedMaxFly;
    }

    public int getChampionOfRunners() {
        int speedMaxRun = 0;
        for (Runable runner : getRunner()) {
            if (speedMaxRun < runner.speedOfRun()) {
                speedMaxRun = runner.speedOfRun();
            }
        }
        return speedMaxRun;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

}
