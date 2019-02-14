import java.util.Scanner;
import java.util.stream.Stream;

public class Palindrom {
    private static Scanner ino = new Scanner(System.in);

    private static String palindrom = "";

    public static void main(String[] args) {
        System.out.println("Proszę podaj palindrom  ");
        palindrom= ino.nextLine();
        System.out.println( new StringBuilder(palindrom).reverse().toString());
        System.out.println(printOutpalindrom(palindrom));

    }

    private static boolean printOutpalindrom(String str) {
        System.out.println( new StringBuilder(palindrom).reverse().toString().replaceAll("\\s+","")+" == ? " + str.replaceAll("\\s+",""));
        return 0 == str.replaceAll("\\s+","").compareToIgnoreCase(new StringBuilder(palindrom).reverse().toString().replaceAll("\\s+","")) ?true:false ;
    }


}
