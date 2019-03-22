package codewarseKata;


public class TwoToOne {
    public static String longest(String s1, String s2) {
        // your code

        return (s1 + s2)
                .codePoints()
                .sorted()
                .distinct()
                .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
    }
}
