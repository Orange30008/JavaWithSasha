package ru.sanyaprepod.lesson3;

public enum Level {
    SKUF(1), ZOOMER(2), MID(3), SPORT(4), SUPERMAN(5);


    private int lvl;

    Level(int lvl) {
        this.lvl=lvl;
    }
    public int getLvl() {
        return lvl;
    }
}
