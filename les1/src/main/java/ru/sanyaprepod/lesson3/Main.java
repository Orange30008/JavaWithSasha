package ru.sanyaprepod.lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        RunWithBarrier human0 = new Human("Гена", Level.MID);
        RunWithBarrier human1 = new Human("TANKIST777", Level.SKUF);

        RunWithBarrier robot0 = new Robot("T1000");

        RunWithBarrier cat0 = new Cat("Гарфилд");

        RunWithBarrier[] member = {
                human0, human1, robot0, cat0
        };

        Barrier bar0 = new Barrier(0.1f);
        Barrier bar1 = new Barrier(0.6f);
        Barrier bar2 = new Barrier(2f);

        Road road0 = new Road(5);
        Road road1 = new Road(10);
        Road road2 = new Road(15);


        ElementTrack[] road = {
                bar0, road0, bar1, road1, bar2, road2
        };


        for (int i = 0; i < member.length; i++) {
            System.out.println("\n" + member[i].getName() + " начал выполнение бега с препядствием");
            for (int j = 0; j < road.length; j++) {
                if (road[j].type() == 0) {
                    int n = member[i].jump((Barrier) road[j]);
                    if (n == 1) {
                        System.out.printf("\n%s сошел с дистанции\n", member[i].getName());
                        break;
                    }
                } else {
                    int b = member[i].run((Road) road[j]);
                    if (b == 1) {
                        System.out.printf("\n%s сошел с дистанции", member[i].getName());
                        break;
                    }
                }
            }
            System.out.println("\n" + member[i].getName() + " закончил выполнение бега с препядствием");
        }


//        for (int i = 0; i < hum.size(); i++) {
//            System.out.println("\n" + hum.get(i).getName() + " начал выполнение бега с препядствием");
//            for (int j = 0; j < road.length; j++) {
//                if(road[j].type()==0) {
//                    int n = hum.get(i).jump((Barrier) road[j]);
//                    if (n == 1) {
//                        System.out.printf("\n%s сошел с дистанции\n", hum.get(i).getName());
//                        break;
//                    }
//                } else {
//                    int b = hum.get(i).run((Road) road[j]);
//                    if (b == 1) {
//                        System.out.printf("\n%s сошел с дистанции", hum.get(i).getName());
//                        break;
//                    }
//                }
//            }
//            System.out.println("\n" + hum.get(i).getName() + " закончил выполнение бега с препядствием");
//        }


    }

}
