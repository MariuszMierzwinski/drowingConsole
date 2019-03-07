import java.util.Arrays;
import java.util.Scanner;

public class reverseOnDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(findShort(scan.nextLine()));

    }

    public static int findShort(String s) {

        return Arrays.stream((s.split(" ")))
                .map(x -> x.length())
                .min(Integer::compare).get();

    }

}
