//Грузовой автомобиль
public class Truck extends Car implements Competable{

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    //Метод начать движение
    @Override
    public void start(){
        System.out.println("Грузовой автомобиль "+getBrand()+" "+getModel()+" начал движение");
    }

    //Метод закончить движение
    @Override
    public void stop(){
        System.out.println("Грузовой автомобиль "+getBrand()+" "+getModel()+" закончил движение");
    }

    @Override
    public String toString(){
        return "Грузовой автомобиль: "+super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль: "+super.getBrand()+", "+super.getModel()+" находится на Пит-Стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время грузового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 700 сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля: "+super.getBrand()+", "+super.getModel()+" - 90 км/час");
    }

}
