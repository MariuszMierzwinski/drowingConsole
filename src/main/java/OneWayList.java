import java.util.Scanner;

public class OneWayList {
    private static ElementListy head = new ElementListy(' ', null);
    private static ElementListy objectnext = null;
    private static int number;
    private static char value;
    private static Scanner readLine = new Scanner(System.in);

    //implementacja listy jednokierunkowej


    public static void main(String[] args) {
      /*  ElementListy one=new ElementListy(1,null);
        ElementListy two=new ElementListy(2,null);
        ElementListy three=new ElementListy(3,null);
        ElementListy four=new ElementListy(4,null);*/
        /*ElementListy five=new ElementListy(5,null);
        head.setNext(one);
        one.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);
        five.setNext(null);*/


        for (int i = 0; i < 5; i++) {
            addList(new ElementListy((char)(65+i), null), head);
        }

        viewList(head);
        System.out.println("Na której pozycji dodać element?");
        number = Integer.parseInt(readLine.nextLine());
        System.out.println("Jaką wartość dodać ?");
        value = readLine.nextLine().charAt(0);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        addListIndex(number,value);
        viewList(head);
        System.out.println("Na której pozycji usunąć element?");
        number = Integer.parseInt(readLine.nextLine());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        remListIndex(number);
        viewList(head);
    }

    private static void remListIndex(int number) {
        ElementListy rem;
        int next=0;
        objectnext = head;
        if (head == null) {
            System.out.println("Pusta lista");
        } else
            while (objectnext.hasnext()&&(next<number-1)) {

                next++;
                objectnext = objectnext.next;
            };
        rem=objectnext.getNext();
        objectnext.setNext(objectnext.getNext().getNext());
        rem.setNext(null);



    }

    private static void addListIndex(int number,char value) {
        int next=0;
        objectnext = head;
        if (head == null) {
            System.out.println("Pusta lista");
        } else
            while (objectnext.hasnext()&&(next<number-1)) {

                next++;
                objectnext = objectnext.next;
            };
        objectnext.setNext(new ElementListy(value,objectnext.getNext()));

    }

    private static void addList(ElementListy newObject, ElementListy head) {
        objectnext = head;
        if (head == null) {
            head = newObject;
            head.setNext(null);
        } else
            while (objectnext.hasnext()) {
                objectnext = objectnext.next;
            }
        ;
        objectnext.setNext(newObject);
        objectnext.getNext().setNext(null);

    }


    private static void viewList(ElementListy head) {
        objectnext = head.getNext();
        while (objectnext != null) {
            System.out.println(objectnext.value);
            objectnext = objectnext.getNext();
        }

    }
}
