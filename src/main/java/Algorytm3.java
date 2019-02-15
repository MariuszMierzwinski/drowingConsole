import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Algorytm3 {
    private static InputStream is=null;
    private static BufferedReader br=null;
    private static FileReader fileReader;




    public static void main(String[] args) {
        outCount(inputIn());


    }

    private static void outCount(ArrayList inputIn) {
        int count=0;
        System.out.println(("*****************************************"));
        System.out.println("Wyjscie");
        for (Object str:inputIn
             ) {
            count+=Integer.parseInt(str.toString());
            System.out.println(count);
        }
    }

    public static  ArrayList inputIn() {
        ArrayList las = new ArrayList();
        String str="";
        try {
            fileReader = new FileReader("/home/mariusz/Documents/MojFolder/liczby.txt");
            BufferedReader br = new BufferedReader(fileReader);
            System.out.println("*****************************************");
            System.out.println("wejscie");
            while ((str=br.readLine()) != null) {
                System.out.println(str);

               las.add(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return las;
    }
}
