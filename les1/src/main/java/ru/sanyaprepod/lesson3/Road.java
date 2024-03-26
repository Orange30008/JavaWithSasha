package ru.sanyaprepod.lesson3;

public class Road extends ElementTrack {
    Road(float size) {

        super(size);
    }

    public float getSize() {

        return size;
    }

    @Override
    public int type() {
        return 1;
    }

    public void info() {

        System.out.printf("\nДлинна дорожки: %f", size);
    }
//    Barrier(float height) {
//        this.height=height;
//    }

}
