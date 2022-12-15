public class Main {
    public static void main(String[] args) {
        Passenger bmw = new Passenger("BMW", "Z8", 215);
        Passenger kia = new Passenger("KIA", "Sportage 4-го поколения", 180);
        Passenger lada = new Passenger("Lada", "110", 120);
        Passenger kia2 = new Passenger("KIA", "Picanto", 180);

        Truck gaz = new Truck("Газ", "3221", 120);
        Truck ural = new Truck("Урал", "Next", 200);
        Truck kamaz = new Truck("Камаз", "5320", 160);
        Truck kamaz2 = new Truck("Камаз", "4310", 160);

        Bus gaz1 = new Bus("Газ", "3221", 120);
        Bus mercedes = new Bus("Mercedes-Benz", "O407", 190);
        Bus mercedes1 = new Bus("Mercedes-Benz", "O879", 190);
        Bus gaz2 = new Bus("Газ", "O879", 190);

        Driver <Passenger> kirill  = new Driver<>("Иванов Кирилл Алексеевич", bmw);
        System.out.println(kirill);

        System.out.println(bmw);
        bmw.doPitStop();
        bmw.showBestTimeOfCircle();
        bmw.showMaxSpeed();

        System.out.println(kia);
        kia.doPitStop();
        kia.showBestTimeOfCircle();
        kia.showMaxSpeed();
        System.out.println(lada);
        lada.doPitStop();
        lada.showBestTimeOfCircle();
        lada.showMaxSpeed();
        System.out.println(kia2);
        kia2.doPitStop();
        kia2.showBestTimeOfCircle();
        kia2.showMaxSpeed();

        System.out.println(gaz);
        gaz.doPitStop();
        gaz.showBestTimeOfCircle();
        gaz.showMaxSpeed();
        System.out.println(ural);
        ural.doPitStop();
        ural.showBestTimeOfCircle();
        ural.showMaxSpeed();
        System.out.println(kamaz);
        kamaz.doPitStop();
        kamaz.showBestTimeOfCircle();
        kamaz.showMaxSpeed();
        System.out.println(kamaz2);
        kamaz2.doPitStop();
        kamaz2.showBestTimeOfCircle();
        kamaz2.showMaxSpeed();

        System.out.println(gaz1);
        gaz1.doPitStop();
        gaz1.showBestTimeOfCircle();
        gaz1.showMaxSpeed();
        System.out.println(mercedes);
        mercedes.doPitStop();
        mercedes.showBestTimeOfCircle();
        mercedes.showMaxSpeed();
        System.out.println(mercedes1);
        mercedes1.doPitStop();
        mercedes1.showBestTimeOfCircle();
        mercedes1.showMaxSpeed();
        System.out.println(gaz2);
        gaz2.doPitStop();
        gaz2.showBestTimeOfCircle();
        gaz2.showMaxSpeed();

    }
}
