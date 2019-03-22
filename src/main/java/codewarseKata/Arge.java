package codewarseKata;



public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        double sum=p0;


        int year=0;
        do{
            sum=+(int)(sum+((sum*percent)*0.01)+aug);
            year++;
        }while (sum < p);

        return year;
    }
}
