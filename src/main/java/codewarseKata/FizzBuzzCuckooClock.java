package codewarseKata;



import java.util.Arrays;



public class FizzBuzzCuckooClock
{
    public static String fizzBuzzCuckooClock(String time) {
        String string = "";
        int[] tab = Arrays.asList(time.split(":")).stream().mapToInt(Integer::parseInt).toArray();
        if ((tab[1] == 0) && (tab[0] == 0)) {
            tab[0] = 12;
        }
        if ((tab[1] == 0) && (tab[0] > 12)) {
            tab[0] = tab[0]-12;
        }
        if ((tab[1] == 0) && (tab[0] != 0)) {
            for (int i = 0; i < tab[0]; i++) {
                string = string + "Cuckoo" + (i < (tab[0]-1) ? " " : "");
            }
        }
        if ((tab[1]%3 != 0) && (tab[1]%5 != 0)) {
            return "tick";
        }
        if ((tab[1] == 30)) {
            return "Cuckoo";
        }
        if ((tab[1]%3 == 0) && (tab[1]%5 == 0)&& (tab[1]!= 0)) {
            return "Fizz Buzz";
        }
        if ((tab[1]%3 == 0)&& (tab[1]!= 0)) {
            return "Fizz";
        }
        if ((tab[1]%5 == 0)&& (tab[1]!= 0)) {
            return "Buzz";
        }

        return string;
    }
}
