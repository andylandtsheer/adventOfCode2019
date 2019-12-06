package be.landtlord.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOneTest {

    @Test
    void calculateFuelConsumption() {
        DayOne dayOne = new DayOne();
        Assertions.assertEquals(2, dayOne.calculateFuelConsumption(12));
        Assertions.assertEquals(2, dayOne.calculateFuelConsumption(14));
        Assertions.assertEquals(654, dayOne.calculateFuelConsumption(1969));
        Assertions.assertEquals(33583, dayOne.calculateFuelConsumption(100756));
    }

    @Test
    void calculateAmountOfFuel() {
        DayOne dayOne = new DayOne();
        Assertions.assertEquals(2, dayOne.calculateAmountOfFuel(14));
        Assertions.assertEquals(966, dayOne.calculateAmountOfFuel(1969));
        Assertions.assertEquals(50346, dayOne.calculateAmountOfFuel(100756));
    }
}