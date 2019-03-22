package codewarseKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadFishTest {
@Test
    public void DeadFishTest(){
    assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
    assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
}
}