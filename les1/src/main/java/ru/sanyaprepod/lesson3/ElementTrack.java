package ru.sanyaprepod.lesson3;

public class ElementTrack {
    protected float size;


    ElementTrack(float size) {
          this.size=size;

      }
    public void info(){

    }
    public int type(){
        return 10;  //можно ли сделать его как "шаблон", по типу абстрактного метода?
    }
}
