import java.util.Scanner;

public class endStringKata {
    public static void main(String[] args) {
        Scanner scann1=new Scanner(System.in);
        System.out.println(solution(scann1.next(),scann1.next()));

    }
        public static boolean solution(String str, String ending) {
            return (str.substring(str.length()-ending.length())).equals(ending);
        }
    }

