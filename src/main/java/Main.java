import java.util.Arrays;
import java.util.Comparator;

import textCo.Text;


public class Main {
    public static void main(String[] args) {

        Car[] cars = {
            new Car(new Text("BMW M3"),       2021, 290.0f, 4.2f, 4),
            new Car(new Text("Toyota Camry"), 2019, 210.0f, 7.8f, 4),
            new Car(new Text("Porsche 911"),  2023, 330.0f, 3.5f, 2),
            new Car(new Text("Honda Civic"),  2018, 200.0f, 8.1f, 4),
            new Car(new Text("Tesla Model S"),2022, 320.0f, 2.9f, 4)
        };

        Arrays.sort(cars, Comparator.comparingInt(c -> c.productionYear));
        System.out.println("\tЗа роком виробництва (зростання):");
        for (Car c : cars) System.out.println(c);

        Arrays.sort(cars, Comparator.comparingDouble((Car c) -> c.topSpeed).reversed());
        System.out.println("\tЗа топ швидкістю (спадання):");
        for (Car c : cars) System.out.println(c);

        Car target = new Car(new Text("Porsche 911"), 2023, 330.0f, 3.5f, 2);

        Car found = null;
        for (Car car : cars) {
            if (car.equals(target)) {
                found = car;
                break;
            }
        }

        System.out.println("\tПошук");
        if (found != null) System.out.println("Знайдено:\n" + found);
        else System.out.println("Не знайдено");
    }

    }
