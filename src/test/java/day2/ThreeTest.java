package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeTest {

    @Test
    void processIntcode() {
        Three three = new Three();
        Assertions.assertArrayEquals(new int[] {2,0,0,0,99},three.processIntcode(new int[]{1,0,0,0,99}));
        Assertions.assertArrayEquals(new int[] {2,3,0,6,99},three.processIntcode(new int[]{2,3,0,3,99}));
        Assertions.assertArrayEquals(new int[] {2,4,4,5,99,9801},three.processIntcode(new int[]{2,4,4,5,99,0}));
        Assertions.assertArrayEquals(new int[] {30,1,1,4,2,5,6,0,99},three.processIntcode(new int[]{1,1,1,4,99,5,6,0,99}));
    }
}