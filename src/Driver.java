public class Driver<T extends Car> {
    private final String name;
    private final boolean driverLicense;
    private final int experience;

    public Driver(String name, boolean driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    //Метод начать движение
    public void startCar(T car){
        //System.out.println("Водитель "+name+" начал движение автомобиля "+car.getBrand()+" "+car.getModel());
        System.out.println("Водитель "+name+ " управляет автомобилем "+ car.getBrand()+" "+car.getModel()+" и будет участвовать в заезде");
    }

    //Метод остановиться
    public void stopCar(T car){
        System.out.println("Водитель "+name+" остановил автомобиль "+car.getBrand()+" "+car.getModel());
    }

    //Метод заправить авто
    public void fillCar(T car){
        System.out.println("Водитель "+name+" заправил автомобиль "+car.getBrand()+" "+car.getModel());
    }



}
