
import transport.Car;
import transport.Bus;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Car carLada = new Car("Lada", "Granta", "Желтый", "Россия", 2015, 1.7f,"Механика", "Седан", 4, 1234, "Зимняя", 120);
        Car carAudi = new Car("Audi", "A8 50 L TDI quat", "Черный", "Германия", 2020, 3.0f,"Автомат", "Спорт", 4, 5678, "Летняя",200);
        Car carBMW = new Car("BMW", "Z8", "Черный", "Германия", 2021  , 3.0f,"Механика", "Седан", 4, 9012, "Зимняя",250);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", "Красный", "Южная Корея", 2018 , 2.4f,"Автомат", "Хэтчбек", 4, 3456, "Летняя",300);
        Car carHy = new Car("Hyundai", "Avante", "Оранжевый", "Южная Корея", 2016 , 1.6f,"Механика", "Хэтчбек", 4, 7890, "Зимняя",100);

        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println(carHy);
        System.out.println();

        Car.Insurance insuranceLada = new Car.Insurance(LocalDate.of(2020, 2, 2), 12345, "54321");
        System.out.println(insuranceLada);
        System.out.println();

        Bus busLiaz = new Bus("ЛИАЗ", "688", "СССР", 1980, "Желтый", 80);
        Bus busIcarus = new Bus("Icarus", "280", "Венгрия", 1990, "Красный", 100);
        Bus busPaz = new Bus("ПАЗ", "Горбатый", "Россия", 2000, "Зелёный", 60);

        System.out.println(busLiaz);
        System.out.println(busIcarus);
        System.out.println(busPaz);
    }
}