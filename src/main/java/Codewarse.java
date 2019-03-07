import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Codewarse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(summation(scan.nextInt()));

    }
        public static int summation(int n) {


            return           Stream.iterate(1,i->i+1)
                    .limit((long)n)
                    .collect(Collectors.toList())
                    .stream()
                   //.forEach(System.out::print);
             .mapToInt(x->x)
                   .sum();

        }
    }

