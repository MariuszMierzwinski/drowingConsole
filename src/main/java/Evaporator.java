import java.util.Scanner;

public class Evaporator {
    static int howManyDays = 0;
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(evaporator(scan.nextDouble(),scan.nextDouble(),scan.nextDouble()));
    }

    public static double evaporator(double content, double evap_per_day, double threshold) {
        double quantity = content;

        do {
            howManyDays++;
            quantity = quantity -( quantity * evap_per_day*0.01 );

            System.out.println(quantity);
        } while (((quantity*10)/content) >= threshold*0.1);
        System.out.println("Ilość "+quantity+" zdatny do = "+evap_per_day*0.01 + " % ");
        return  howManyDays;

    }
}
