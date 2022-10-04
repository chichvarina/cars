//легковой автомобиль
public class PassengerCar extends Car implements Competable{

    public PassengerCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    //Метод начать движение
    @Override
    public void start(){
        System.out.println("Легковой автомобиль: "+getBrand()+" "+getModel()+" начал движение");
    }

    //Метод закончить движение
    @Override
    public void stop(){
        System.out.println("Легковой автомобиль: "+getBrand()+" "+getModel()+" закончил движение");
    }

    @Override
    public String toString(){
        return "Легковой автомобиль: "+super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль: "+super.getBrand()+", "+super.getModel()+" находится на Пит-Стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время легкового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 220 сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 170 км/час");
    }

}
