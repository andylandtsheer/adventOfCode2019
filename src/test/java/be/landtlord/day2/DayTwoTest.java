package be.landtlord.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayTwoTest {

    @Test
    void processIntcode() {
        DayTwo dayTwo = new DayTwo();
        Assertions.assertArrayEquals(new int[] {2,0,0,0,99}, dayTwo.processIntcode(new int[]{1,0,0,0,99}));
        Assertions.assertArrayEquals(new int[] {2,3,0,6,99}, dayTwo.processIntcode(new int[]{2,3,0,3,99}));
        Assertions.assertArrayEquals(new int[] {2,4,4,5,99,9801}, dayTwo.processIntcode(new int[]{2,4,4,5,99,0}));
        Assertions.assertArrayEquals(new int[] {30,1,1,4,2,5,6,0,99}, dayTwo.processIntcode(new int[]{1,1,1,4,99,5,6,0,99}));
    }
}