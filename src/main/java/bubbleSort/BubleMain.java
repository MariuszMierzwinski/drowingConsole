package bubbleSort;

public class BubleMain {
    private int[] list;

    public static void main(String[] args) {
        int[] list = {4, 2, 6, 3, 4, 1, 2, 5, 6, 4, 6, 6, 7, 8};
        BubbleSort lista=new BubbleSort();
        for (int i: list
        ) {
            System.out.print(i+", ");

        }
        System.out.println();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
      lista.setList(list);
      lista.sort();

        for (int i: list
        ) {
            System.out.print(i+", ");
        }
}
}
