import java.util.Scanner;

public class BraceChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(isValid(scan.nextLine()));
        System.out.println(scan.nextLine());
    }
    public static boolean isValid(String braces){
        String b = braces;
        System.out.println(braces);

        for (int i = 0; i <braces.length()/2 ; i++) {


            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if (b.length() == 0)
                return true;
        }
        return false;
    }
}
