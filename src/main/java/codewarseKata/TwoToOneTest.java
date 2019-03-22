package codewarseKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoToOneTest {

    @Test
    void longest() {
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
    }
}