package ru.sbgeu.lichman.basic.animals;

public class Horse extends Animals {

    public Horse(String name, int runningSpeed, int swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);

    }

    @Override
    public int swim(int distance) {

        if (endurance * 4 < distance) {
            System.out.println("Животное " + name + " отбросит коньки, если не отдохнет");
            return -1;
        }

        if (swimmingSpeed > 0) {
            System.out.println(name + " пробежит " + distance + "метров за " + distance / swimmingSpeed + " секунд");
            endurance = endurance - distance;
            return distance / swimmingSpeed;
        }
        return -1;
    }
}
