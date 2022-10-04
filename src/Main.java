public class Main {
    public static void main(String[] args) {

        PassengerCar lada = new PassengerCar("Lada", "Grande", 1.7f);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3f);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3f);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4 поколение", 2.4f);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);

        System.out.println();

        Truck kamaz = new Truck("КамАЗ", "4308", 5.9f);
        Truck man = new Truck("MAN", "Tgm", 7f);
        Truck volvo = new Truck("Volvo", "FM", 6.5f);
        Truck scania = new Truck("Scania", "R500", 8.5f);
        System.out.println(kamaz);
        System.out.println(man);
        System.out.println(volvo);
        System.out.println(scania);

        System.out.println();

        Bus paz = new Bus("ПАЗ", "3205", 5f);
        Bus liaz6228 = new Bus("ЛиАЗ", "6228 Вояж L", 6f);
        Bus liaz5292 = new Bus("ЛиАЗ", "5292", 6.5f);
        Bus nefaz = new Bus("НефАЗ", "52998", 5.5f);
        System.out.println(paz);
        System.out.println(liaz6228);
        System.out.println(liaz5292);
        System.out.println(nefaz);

        System.out.println();

        Driver<PassengerCar> ivanov = new Driver<PassengerCar>("Иванов", true, 10);
        Driver<Truck> petrov = new Driver<Truck>("Петров", true, 10);
        Driver<Bus> sidorov = new Driver<Bus>("Сидоров", true, 10);

        ivanov.startCar(bmw);
        petrov.startCar(volvo);
        sidorov.startCar(paz);

    }
}