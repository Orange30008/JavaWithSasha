package ru.sanyaprepod.lesson3;

public class Robot implements RunWithBarrier {
    private String name;
    private float maxJump;
    private float maxRun;

    public Robot(String name) {
        this.name = name;
        maxJump = 1.5F;
        maxRun = 20f;
    }

    public void info() {
        System.out.printf("Имя: %s\nПрыжок: %f\nБег: %f", name, maxJump, maxRun);
    }

    public String getName() {
        return name;
    }

    @Override
    public int run(Road road) {
        if (road.getSize() <= maxRun) {
            System.out.printf("\n%s бежит %f метров", name, road.getSize());
            return 0;
        } else {
            System.out.printf("\n%s не смог пробежать %f метров", name, road.getSize());
            return 1;
        }
    }

    @Override
    public int jump(Barrier bar) {
        if (bar.getSize() <= maxJump) {
            System.out.printf("\n%s перепрыгивает %f метровый барьер", name, bar.getSize());
            return 0;
        } else {
            System.out.printf("\n%s не смог перепрыгнуть %f метровый барьер", name, bar.getSize());
            return 1;
        }
    }
}
