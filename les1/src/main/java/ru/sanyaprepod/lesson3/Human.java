package ru.sanyaprepod.lesson3;

public class Human implements RunWithBarrier {
    private String name;
    private float maxJump;
    private float maxRun;

    public Human(String name, Level level) {
        this.name=name;
        maxJump= level.getLvl()/5f;
        maxRun= level.getLvl()*5f;
    }

    public void info(){
        System.out.printf("Имя: %s\nПрыжок: %f\nБег: %f", name, maxJump, maxRun);
    }
    public String getName(){
        return name;
    }
    @Override
    public int run(Road road) {
        if(road.getSize()<=maxRun) {
            System.out.printf("\n%s бежит %f метров", name,road.getSize());
            return 0;
        }
        else {
            System.out.printf("\n%s не смог пробежать %f метров", name, road.getSize());
            return 1;
        }
    }

    @Override
    public int jump(Barrier bar) {
        if(bar.getSize()<=maxJump) {
            System.out.printf("\n%s перепрыгивает %f метровый барьер", name,bar.getSize());
            return 0;
        }
        else {
            System.out.printf("\n%s не смог перепрыгнуть %f метровый барьер", name, bar.getSize());
            return 1;
        }
    }
}
