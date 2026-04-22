import java.util.Objects;

import textCo.Word;

public class Car {

    public Word name;
    public int productionYear;
    public float topSpeed;
    public float acceleration;
    public int numberOfDoors;

    /**
     * Constructs a new Car with all characteristics.
     *
     * @param name           the model name of the car
     * @param productionYear the year it was manufactured
     * @param topSpeed       top speed in km/h
     * @param acceleration   0-100 km/h time in seconds
     * @param numberOfDoors  number of doors
     */
    public Car(Word name, int productionYear, float topSpeed, float acceleration, int numberOfDoors) {
        this.name = name;
        this.productionYear = productionYear;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Checks whether this car is equal to another object.
     * Two cars are considered equal if all fields match.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return productionYear == other.productionYear &&
            numberOfDoors == other.numberOfDoors &&
            Float.compare(topSpeed, other.topSpeed) == 0 &&
            Float.compare(acceleration, other.acceleration) == 0 &&
            Objects.equals(name, other.name);
    }

    /**
     * Returns a string representation of this car.
     */
    @Override
    public String toString() {
        return "Name: " + name + ";\n" +
               "Production year: " + productionYear + ";\n" +
               "Top speed: " + topSpeed + ";\n" +
               "Acceleration: " + acceleration + ";\n" +
               "Number of doors: " + numberOfDoors + ";\n";
    }
}