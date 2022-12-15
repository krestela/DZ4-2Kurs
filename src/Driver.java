public class Driver <T extends Car> {
    private String fullName;

    private String driverLicense;

    private int experience;

    private T car;

    public Driver(String fullName, String driverLicense, int experience, T car) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
        this.car = car;
    }
    public Driver(String fullName, T car) {
        this.fullName = fullName;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) {
            this.fullName = fullName;
        }
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense != null && !driverLicense.isEmpty() && !driverLicense.isBlank()) {
            this.driverLicense = fullName;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience == Integer.parseInt(null)) {
            this.experience = experience;
        }
    }

    public void startWay(){
        System.out.println("Начать движение");
    }
    public void stop(){
        System.out.println("Остановить движение");
    }

    public void refuelTheCar(){
        System.out.println("Заправить машину");
    }

    @Override
    public String toString() {
        return "Bодитель " + fullName+ " управляет автомобилем " + car.getBrand() + car.getModel() + " и будет участвовать в заезде";
    }
}
