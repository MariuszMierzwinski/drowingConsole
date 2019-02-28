package kopiec;

public class KopiecMain {
    public static void main(String[] args) {
        Kopiec kop=new Kopiec();
       kop.add(10);
       kop.add(20);
       kop.add(30);
       kop.add(40);
       kop.add(25);
       kop.add(15);
       kop.add(5);
       kop.add(2);
       kop.add(4);
       kop.add(14);
       kop.add(41);
       kop.add(22);
       kop.add(32);


     /*public void rebuildAfterGet(int idx)
       {
            if(kop.isEmpty())return;
        }*/

      /*  for (int i=0;i<kop.getSize();i++){
            System.out.println(kop.getTab().get(i));
        }*/
        System.out.println("Rozmiar "+ kop.getSize());
        System.out.println();
        kop.print();

    }
}
