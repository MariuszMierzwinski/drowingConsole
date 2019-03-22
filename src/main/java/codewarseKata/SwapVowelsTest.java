package codewarseKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapVowelsTest {
    @Test

    public void swap_1() {
        assertEquals("HEllOWOrld!",SwapVowels.swap("HelloWorld!"));
    }

    @Test
    public void swap_2() {
        assertEquals("SUndAy",SwapVowels.swap("Sunday"));
    }

}