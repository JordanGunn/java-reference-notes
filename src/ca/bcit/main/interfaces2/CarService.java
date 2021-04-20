package ca.bcit.main.interfaces2;

public class CarService {

    public void drive() {
        Car bmw = new BMW();
        Porsche porsche = new Porsche();
        Mercedes mercedes = new Mercedes();
        Car[] cars = {new BMW(), new Porsche(), new Mercedes()};

        for (Car car: cars) {
            car.drive();
        }


        bmw.drive();
        porsche.drive();
        mercedes.drive();
    }
}
