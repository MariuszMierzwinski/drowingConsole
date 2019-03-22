package codewarseKata;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Revers_Kata {
    public static void main(String[] args) {
        System.out.println(reverseWords("Awruk Awruk   "));
    }

    public static String reverseWords(final String original) {
        char[] charArray = original.toCharArray();
        if (original.trim().length()==0) {return original;}
        return Stream.of(original)
                .map(s -> s.split(" "))
                .map(x -> Arrays.stream(x)
                        .map(word -> new StringBuilder(word).reverse().toString())
                        .collect(Collectors.joining(" ")))
                .collect(Collectors.joining(" "));




        /* .collect(Collectors.joining(" "));*/
        // Have at it
        //return "asa";

    }
}
