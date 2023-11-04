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
        run((int)(Math.random()*10));
        swim((int)(Math.random()*10));
    }

    public void run (int distance) {

System.out.println("Животное " + name + "во время бега потратило 1 ед. выносливости");
    }

    public void swim (int distance) {
}}
