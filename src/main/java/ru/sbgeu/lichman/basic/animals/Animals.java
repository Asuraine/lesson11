package ru.sbgeu.lichman.basic.animals;

public class Animals {
    protected String name;
    protected int runningSpeed;
    protected int swimmingSpeed;
    protected int endurance;


    public Animals(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;

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

        if (this instanceof Cat) {
            System.out.println("Коты не умеют плавать!");
        }
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


    public void info() {
        System.out.println("Животное по кличке " + name + "имеет скорость бега " + runningSpeed + " имеет выносливость " + endurance);
        System.out.println(name + " может проплыть за " + swimmingSpeed + " м/с");
    }
}
