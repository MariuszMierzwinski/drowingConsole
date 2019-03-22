package codewarseKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Revers_KataTest {
    @Test
    public void exampleCases() {
        assertEquals("kurwA",Revers_Kata.reverseWords("Awruk"));
        assertEquals("elppa", Revers_Kata.reverseWords("apple"));
    }
}