package ru.sanyaprepod.lesson2;

public class Group {
    private Worker[] workers = new Worker[10];
    private String name;      //Вопрос про то как его лучше задать

    public Group(String name) {
        this.name = name;
    }

    public void add(Worker worker,int ID) {

        this.workers[ID] = worker;

    }

    //
    public void info() {
        System.out.println("____________________________");
        System.out.println("\nНазвание группы: " + name);
        int nullCounter = 0;
        for (int i = 0; i < workers.length ; i++)
         {
            if (workers[i] != null) {
                System.out.println("____________________________");
                System.out.println("ID сотрудника в группе: " + i);
                workers[i].info();

            } else{
                nullCounter++;
            }

        }
        if(nullCounter == 10) {
            System.out.println("Группа пуста");
        }

    }

    public void remove(int id) {
        this.workers[id] = null;
    }
    public void removeAll() {
        for (int i = 0; i < workers.length ; i++) {
            this.workers[i] = null;
        }
    }

}

