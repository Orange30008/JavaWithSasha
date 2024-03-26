package ru.sanyaprepod.lesson2;

public class Worker {
    private String name;
    private String email;
    private int age;
    private String position;


    public Worker(String name, String email, int age, String position) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }
    public void info(){
        System.out.printf("\nИнформация о сотруднике:\nИмя - %s\nEmail - %s\nВозраст - %d\nДолжность - %s\n", name, email, age, position);
    }




}
