package codewarseKata;

public class SwapVowels {
    public static String swap(String st) {
        return st.chars()
                .mapToObj(i -> (char)i)
                .map(x->((x=='a')||(x=='e')||(x=='i')||(x=='o')||(x=='u'))? Character.toUpperCase(x):x)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
