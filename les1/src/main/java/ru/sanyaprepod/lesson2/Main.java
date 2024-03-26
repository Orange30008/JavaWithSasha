package ru.sanyaprepod.lesson2;


import ru.sanyaprepod.lesson2.Group;
import ru.sanyaprepod.lesson2.Worker;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Vlad1", "email1", 1, "java1");
        Worker worker2 = new Worker("Vlad2", "email2", 2, "java2");
        Worker worker3 = new Worker("Vlad3", "email3", 3, "java3");
        Worker worker4 = new Worker("Vlad4", "email4", 4, "java4");

        worker1.info();


        Group group1 = new Group("Blyad");

        group1.add(worker1,0);
        group1.add(worker2,1);
        group1.add(worker3,2);
        group1.add(worker4,6);

        group1.info();

        group1.remove(6);
        group1.info();

        Group group2 = new Group("PUSTAYA");
        group2.info();

        group1.removeAll();
        group1.info();


    }

}
