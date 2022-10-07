public class Main {
    public static void main(String[] args) {

        PassengerCar lada = new PassengerCar("Lada", "Grande", 1.7f, PassengerCar.Body.SEDAN);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3f, PassengerCar.Body.PICKUP);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3f, PassengerCar.Body.HATCHBACK);
        PassengerCar kia = new PassengerCar("Kia", "Sportage 4 поколение", 2.4f, null);

        System.out.println(lada);
        lada.getBody();

        System.out.println(audi);
        audi.getBody();

        System.out.println(bmw);
        bmw.getBody();

        System.out.println(kia);
        kia.getBody();

        Truck kamaz = new Truck("КамАЗ", "4308", 5.9f, 3f);
        Truck man = new Truck("MAN", "Tgm", 7f, 6f);
        Truck volvo = new Truck("Volvo", "FM", 6.5f, 7f);
        Truck scania = new Truck("Scania", "R500", 8.5f, 14f);

        System.out.println(kamaz);
        kamaz.getCarringCapacity();

        System.out.println(man);
        man.getCarringCapacity();

        System.out.println(volvo);
        volvo.getCarringCapacity();

        System.out.println(scania);
        scania.getCarringCapacity();

        Bus paz = new Bus("ПАЗ", "3205", 5f, 18 );
        Bus liaz6228 = new Bus("ЛиАЗ", "6228 Вояж L", 6f, 70);
        Bus liaz5292 = new Bus("ЛиАЗ", "5292", 6.5f, 110);
        Bus nefaz = new Bus("НефАЗ", "52998", 5.5f, 55);

        System.out.println(paz);
        paz.getBusCapasity();

        System.out.println(liaz6228);
        liaz6228.getBusCapasity();

        System.out.println(liaz5292);
        liaz5292.getBusCapasity();

        System.out.println(nefaz);
        nefaz.getBusCapasity();

        Driver<PassengerCar> ivanov = new Driver<PassengerCar>("Иванов", true, 10);
        Driver<Truck> petrov = new Driver<Truck>("Петров", true, 10);
        Driver<Bus> sidorov = new Driver<Bus>("Сидоров", true, 10);

        ivanov.startCar(bmw);
        petrov.startCar(volvo);
        sidorov.startCar(paz);

    }
}