package test;

public class Car {

    void Car_def(FourWheel f){
        f.carName();
        f.carSound();
    }


    static public void main(String[] args){
        Car c = new Car();
        FourWheel f = new BMW();
        c.Car_def(f);

    }
}
