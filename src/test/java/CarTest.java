import org.junit.Assert;
import org.junit.Test;

public class CarTest {


    @Test
    public void testEqualsIdenticalCars() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Car car2 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Assert.assertTrue(car1.equals(car2));
    }

    @Test
    public void testEqualsSameReference() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Assert.assertTrue(car1.equals(car1));
    }

    @Test
    public void testEqualsNull() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Assert.assertFalse(car1.equals(null));
    }

    @Test
    public void testEqualsDifferentName() {
        Car car1 = new Car("BMW M3",      2021, 290.0f, 4.2f, 4);
        Car car2 = new Car("Toyota Camry", 2021, 290.0f, 4.2f, 4);
        Assert.assertFalse(car1.equals(car2));
    }

    @Test
    public void testEqualsDifferentYear() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Car car2 = new Car("BMW M3", 2019, 290.0f, 4.2f, 4);
        Assert.assertFalse(car1.equals(car2));
    }

    @Test
    public void testEqualsDifferentTopSpeed() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Car car2 = new Car("BMW M3", 2021, 300.0f, 4.2f, 4);
        Assert.assertFalse(car1.equals(car2));
    }

    @Test
    public void testEqualsDifferentAcceleration() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Car car2 = new Car("BMW M3", 2021, 290.0f, 5.0f, 4);
        Assert.assertFalse(car1.equals(car2));
    }

    @Test
    public void testEqualsDifferentDoors() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Car car2 = new Car("BMW M3", 2021, 290.0f, 4.2f, 2);
        Assert.assertFalse(car1.equals(car2));
    }

    @Test
    public void testEqualsDifferentObject() {
        Car car1 = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Assert.assertFalse(car1.equals("BMW M3"));
    }


    @Test
    public void testToStringContainsName() {
        Car car = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Assert.assertTrue(car.toString().contains("BMW M3"));
    }

    @Test
    public void testToStringContainsYear() {
        Car car = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Assert.assertTrue(car.toString().contains("2021"));
    }

    @Test
    public void testToStringContainsTopSpeed() {
        Car car = new Car("BMW M3", 2021, 290.0f, 4.2f, 4);
        Assert.assertTrue(car.toString().contains("290.0"));
    }
}