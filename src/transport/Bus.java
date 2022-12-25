package transport;

public class Bus extends Transport {


    public Bus(String brand, String model, String productionCountry, int productionYear, String color, int maxSpeed) {
        super(brand, model, productionCountry, productionYear, color, maxSpeed);
    }

    public String toString() {
        return "марка:" + brand + " модель:" + model + " цвет кузова:" + color + " год пр-ва:"
                + productionYear + " страна сборки:" + productionCountry + " максимальная скорость: " + maxSpeed;
    }
}