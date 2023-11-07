package ru.sbgeu.lichman.basic.animals;

public class Dog extends Animal {
    public Dog(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance, 2);
    }

    @Override
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
}

