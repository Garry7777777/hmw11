package transport;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected final int productionYear;
    protected final String productionCountry;
    protected String color;
    protected int maxSpeed;


    public Transport(String brand, String model, String productionCountry, int productionYear, String color, int maxSpeed) {

        if (brand == null) this.brand = "default";
        else this.brand = brand;

        if (model == null) this.model = "default";
        else this.model = model;

        if (productionCountry == null) this.productionCountry = "default";
        else this.productionCountry = productionCountry;

        if (productionYear <= 0) this.productionYear = 2000;
        else this.productionYear = productionYear;

        setColor(color);
        setMaxSpeed(maxSpeed);
    }

        public void setMaxSpeed(int maxSpeed) {
            if (maxSpeed <= 0 ) this.maxSpeed = 0;
            else  this.maxSpeed = maxSpeed;
        }

        public void setColor(String color) {
            if (color == null) this.color = "белый";
            else this.color = color;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getProductionCountry() {
            return productionCountry;
        }

        public int getProductionYear() {
            return productionYear;
        }

        public float getMaxSpeed() {
            return maxSpeed;
        }

        public String getColor() {
            return color;
        }


    }



