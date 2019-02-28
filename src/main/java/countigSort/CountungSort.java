package countigSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class CountungSort {
    private static int[] tab = { 9, 1, 1, 1,8,6,5,5,5};
    static int min = Arrays.stream(tab).min().getAsInt();
    static int max = Arrays.stream(tab).max().getAsInt();
    static int[] count = new int[max - min+2];

    public static void main(String[] args) {
        Arrays.stream(tab)
                .forEach(System.out::print);
        System.out.println();
        counting();
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        Arrays.stream(count)
                .forEach(System.out::print);
        System.out.println();
        printingSortTab(count);

    }

    public static void counting() {
        for (int i = 0; i <count.length; i++) {
            count[i] = 0;
            System.out.print(i);
        }
        for (int i : tab) {
            count[i]++;
        }
    }

    private static void printingSortTab(int[] count) {
        for (int i = 0; i < count.length; i++) {
            for (int j = 1; j <= count[i]; j++) {
                System.out.print(i );
            }
        }
    }

}
