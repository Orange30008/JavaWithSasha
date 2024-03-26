package ru.sanyaprepod.lesson3;

public class Barrier extends ElementTrack {
    Barrier(float size) {
        super(size);

    }

    public float getSize() {
        return size;
    }

    @Override
    public int type() {
        return 0;
    }

    public void info() {
        System.out.printf("\nВысота барьера: %f", size);
    }
//    Barrier(float height) {
//        this.height=height;
//    }

}
