package arrayExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;

public class ArrayExample {
    private static int[][] tab = new int[2][2];

    public static void main(String[] args) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = (int) (Math.random() * 100);

            }
        }
        print();
        System.out.println("liczba elementów =" + (Arrays.stream(tab).mapToInt(arr -> (int) IntStream.of(arr).count())
        ).sum());
        System.out.println("Suma elementów wynosi =" + cout());
        System.out.println("Średnia wynosi= " + avr());
        System.out.println("Min wynosi= " + min());
        System.out.println("Max wynosi= " + max());
        printLeftDownTriangle();
    }

    private static void print() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (j < tab[0].length - 1) {
                    System.out.print(tab[i][j] + ", ");
                } else System.out.println(tab[i][j]);

            }
        }
    }

    private static int cout() {
        return Arrays.stream(tab).mapToInt(arr -> IntStream.of(arr).sum()) // sum the inner array
                .sum();
    }

    private static double avr() {
        return (cout() / (Arrays.stream(tab).mapToDouble(arr -> (int) IntStream.of(arr).count())
                .sum()));
    }

    private static int min() {
        return Arrays.stream(tab)
                .flatMapToInt(Arrays::stream)
                .min()
                .getAsInt();

    }

    private static int max() {
        return Arrays.stream(tab)
                .flatMapToInt(Arrays::stream)
                .max()
                .getAsInt();

    }

    private static void printLeftDownTriangle() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (j < tab[0].length - 1) {
                    System.out.print(tab[i][j] + ", ");
                } else System.out.println(tab[i][j]);

            }
        }
    }
}

