public class Stosmain {
    public static void main(String[] args) {
        Stos stosik=new Stos();
       for (int i=0;i<6;i++){
            stosik.push("wartość "+ i);
                  }
        stosik.print();

        System.out.println(stosik.isEmpty());
        System.out.println(stosik.count());
        while (!(stosik.isEmpty())){
            System.out.println(stosik.pop());
        }
        System.out.println(stosik.isEmpty());
        System.out.println(stosik.count());
    }
}
