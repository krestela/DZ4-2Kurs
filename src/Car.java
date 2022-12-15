public class Car {
    private String brand;

    private String model;


    private int engineCapacity;

    public Car(String brand, String model, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        if (engineCapacity == Integer.parseInt(null)) {
            this.engineCapacity = engineCapacity;
        }
    }

    public void startMoving(){
        System.out.println("Начать движение");
    }

    public void stopMoving(){
        System.out.println("Закончить движение");
    }



    public String toString() {
        return brand+ ". Mодель " +model+ ". Объем двигателя: "+ engineCapacity + " л.";

    }
}
