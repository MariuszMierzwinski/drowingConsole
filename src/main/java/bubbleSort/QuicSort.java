package bubbleSort;

public class QuicSort {
    private static int[] list = { 2,2,2,2,11,10,9, 8, 7, 6, 5, 4, 3,  1,0};

    public static void main(String[] args) {
        for (int i : list) {
            System.out.print(i + ", ");
        }
        sSort();
        System.out.println();
        for (int i : list) {
            System.out.print(i + ", ");
        }

    }


    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    private static void sSort() {
        quickSort(list, 0, list.length-1);
    }

    public QuicSort(int[] list) {
        this.list = list;
    }


    public static int middle(int indexBegin, int indexEnd) {

        return indexEnd - ((indexEnd - indexBegin) >>> 1);
    }

    public static void quickSort(int[] tab, int indexBegin, int indexEnd) {
        if (indexBegin < indexEnd) {
            partition(indexBegin, indexEnd);

            /*quickSort(tab, indexBegin, partitionIndex-1 );
            quickSort(tab, partitionIndex +1, indexEnd);*/
        }
    }

    private static void partition(int indexBegin, int indexEnd) {
        int begin = indexBegin;
        int end = indexEnd;

        int pivot = list[middle(indexBegin, indexEnd)];

        do {
            while ((list[begin] < pivot)) {
                begin++;
            }
            while ((list[end] > pivot)) {
                end--;
            }
            if (begin<=end) {
                change(begin, end);
                begin++;
                end--;
            }

        } while (begin <= end);
        if (indexBegin < end) {
            partition(indexBegin, end);
        }
        if (indexEnd > begin) {
            partition( begin, indexEnd);
        }


    }

    public static void change(int first, int second) {
        int temp = list[first];
        list[first] = list[second];
        list[second] = temp;


    }
}
