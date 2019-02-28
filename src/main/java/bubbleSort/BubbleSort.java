package bubbleSort;

public class BubbleSort {
    private static int[] list ;

    public BubbleSort() {
    }

    public static int[] getList() {
        return list;
    }

    public static void setList(int[] list) {
        BubbleSort.list = list;
    }

    public  void sort() {
        int temp;
        int zmiana=1;
        while(zmiana > 0){
            zmiana = 0;
            for(int j = 0; j <list.length-1; j++) {
            if(list[j]>list[j+1]){
                temp=list[j];
                list[j]=list[j+1];
                list[j+1]=temp;
                zmiana++;
            }
        }
        }

    }



}
