package ru.sbgeu.lichman.basic.animals;

public abstract class Animal {
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int endurance;
    protected int swimmingCoefficient;


    public Animal(String name, int runningSpeed, int swimmingSpeed, int endurance, int swimmingCoefficient) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;
        this.swimmingCoefficient = swimmingCoefficient;

    }

    public int run(int distance) {

        if (endurance < distance) {
            System.out.println("Животное " + name + " отбросит коньки, если не отдохнет");
            return -1;
        }

        if (runningSpeed > 0) {
            System.out.println(name + " пробежит " + distance + "метров за " + distance / runningSpeed + " секунд");
            endurance = endurance - distance;
            return distance / runningSpeed;


        }
        return -1;
    }

    public int swim(int distance) {
        int requiredEndurence = distance * swimmingCoefficient;
        if (endurance < distance) {
            System.out.println("Животное " + name + " отбросит коньки, если не отдохнет");
            return -1;
        }

        if (swimmingSpeed > 0) {
            int time = distance / swimmingSpeed;
            System.out.println(name + " проплывет " + distance + " метров за " + distance / swimmingSpeed + " секунд");
            endurance = endurance - distance;
            return time;
        }
        return -1;
    }

    public void info() {
        System.out.println("Животное по кличке " + name + " имеет скорость бега " + runningSpeed + " имеет выносливость " + endurance);
        System.out.println(name + " может проплыть за " + swimmingSpeed + " м/с");
    }

}
