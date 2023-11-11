package ru.sbgeu.lichman.basic;

import ru.sbgeu.lichman.basic.animals.Cat;
import ru.sbgeu.lichman.basic.animals.Dog;
import ru.sbgeu.lichman.basic.animals.Horse;

import java.util.Objects;

public class MainApll {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 50, 300);
        Dog dog = new Dog("Оскар", 100, 20, 500);
        Horse horse = new Horse("Инфинити", 150, 30, 1000);

        horse.swim(455);
        horse.info();
        cat.info();
        dog.info();
        horse.run(300);
        cat.run(200);
        dog.swim(140);
        dog.info();
        horse.swim(200);
        horse.info();

    }
}
