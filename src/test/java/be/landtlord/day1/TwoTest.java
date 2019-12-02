package be.landtlord.day1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoTest {
    Two two;

    @BeforeEach
    void setUp() {
        two = new Two();
    }

    @Test
    void calculateAmountOfFuel() {
        Assertions.assertEquals(2,two.calculateAmountOfFuel(14));
        Assertions.assertEquals(966,two.calculateAmountOfFuel(1969));
        Assertions.assertEquals(50346,two.calculateAmountOfFuel(100756));
    }
}