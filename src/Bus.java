//Автобус
public class Bus extends Car implements Competable{

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    //Метод начать движение
    @Override
    public void start(){
        System.out.println("Автобус: "+getBrand()+" "+getModel()+" начал движение");
    }

    //Метод закончить движение
    @Override
    public void stop(){
        System.out.println("Автобус: "+getBrand()+" "+getModel()+" закончил движение");
    }

    @Override
    public String toString(){
        return "Автобус: "+super.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус: "+super.getBrand()+", "+super.getModel()+" находится на Пит-Стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время автобуса: "+super.getBrand()+", "+super.getModel()+" - 600 сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса: "+super.getBrand()+", "+super.getModel()+" - 100 км/час");
    }
}
