public class Passenger extends Car implements Competing {
    public Passenger(String brand, String model, int engineCapacity) {
        super(brand, model, engineCapacity);
    }


    @Override
    public void doPitStop() {
        System.out.println("Автомобиль " + getBrand() + getModel() + " заезжает на остановку для проверки.");
        System.out.println("Автомобиль " + getBrand() + getModel() + " прошел проверку и уезжает с пит-стопа.");
    }

    @Override
    public void showBestTimeOfCircle() {
        double anyNumber = 2.0f;
        double anyNumber1 = 1 + Math.random() * (anyNumber);
        double result1 = Math.round(anyNumber1);
        System.out.printf("Лучшее время " + getBrand() + getModel() + " составляет " + result1 + " минут\n");

    }

    @Override
    public void showMaxSpeed() {
        double value = 200.f;
        double value1 = 100 + Math.random() * value;
        double result = Math.round (value1);
        System.out.format("Максимальная скорость автомобиля " + getBrand() + getModel() + " составляет " + result + " км/ч\n");
    }
}
