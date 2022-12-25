package transport;

public class Car extends Transport {
    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private int regNumber;
    private final int seatsAmount;
    private boolean isWinterTires;


    public Car (String brand, String model, String color, String productionCountry, int productionYear, float engineVolume, String transmission, String bodyType, int seatsAmount, int regNumber, String Tires, int maxSpeed) {
        super(brand, model, productionCountry, productionYear, color, maxSpeed);

        if (bodyType == null || bodyType.isBlank()) this.bodyType = "default";
        else this.bodyType = bodyType;

        if (seatsAmount <= 0) this.seatsAmount = 0;
        else this.seatsAmount = seatsAmount;


        if (engineVolume <= 0) this.engineVolume = 1.5f;
        else this.engineVolume = engineVolume;

        if (Tires == "Зимняя") this.isWinterTires = true;
        else this.isWinterTires = false;

        setRegNumber(regNumber);
    }

        public void changeTires ( int month){
            isWinterTires = month < 12 && month > 2;
        }
        public String getBodyType() {
            return bodyType;
        }
        public int getRegNumber() {
            return regNumber;
        }
        public void setRegNumber(int regNumber) {
            if (regNumber <= 0) this.regNumber = 0;
            else this.regNumber = regNumber;
        }
        public int getSeatsAmount() {
            return seatsAmount;
        }
        public boolean isWinterTires() {
            return isWinterTires;
        }
        public void setWinterTires(boolean winterTires) {
            this.isWinterTires = winterTires;
        }

    public String toString() {
        return "марка:" + brand + " модель:" + model + " объем двигателя:" + engineVolume
                + " цвет кузова:" + color + " год пр-ва:" + productionYear + " страна сборки:" + productionCountry
                + " регистрационный номер: " + regNumber + " кол-во мест: " + seatsAmount + " Коробка передач: " + transmission +
                " зимняя резина: " + isWinterTires +"тип кузова: " + bodyType;
    }
}

