package kopiec;

import java.util.ArrayList;

public class Kopiec {
    private int i, j;
    private int size = 0;

    private ArrayList<Integer> tab = new ArrayList<>();

    public ArrayList<Integer> getTab() {
        return tab;
    }

    public void setTab(ArrayList<Integer> tab) {
        this.tab = tab;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Kopiec() {

    }

    public void add(int value) {
        addValue(value, size);
    }

    public void rebuild(int child, int parent) {
        int temp = tab.get(child);
        tab.set(child, tab.get(parent));
        tab.set(parent, temp);

    }

    public void addValue(int value, int index) {
        if ((index == 0) && (size == 0)) {
            tab.add(0, value);
            size++;
            return;

        } else {

            i = index; //indeks na ostatni element
            j = (i - 1) / 2; //indeks ojca

            if ((i > 0) && (tab.get(j) < value)) {//sprawdzamy warunek kopca)
                /*tab.add(i, value);
                rebuild(i, j);*/
                i = j; //przenosimy się na pozycję ojca
                j = (i - 1) / 2; //obliczamy indeks ojca
                addValue(value, i);//wstawiamy element do kopca
            } else {
                tab.add(i, value);
                size++;
                return;
            }


        }
    }

    private int printNewLine(int count, int level) {
        double amount = 0;
        for (int i = 0; i <= level; i++) {
            amount += Math.pow(2, i);
        }

        if (amount <= count) {
            System.out.println();
            return ++level;
        }
        return level;
    }

    public void print() {
        int level = 0;
        int count = 0;
        for (Integer val : tab) {
            printMask(level, val);
            level = printNewLine(++count, level);
        }
    }

    private int countLevels() {
        int lev = 0;
        int capacity = 0;
        while (capacity < tab.size()) {
            capacity += Math.pow(2, ++lev);
        }
        return lev;
    }

    private void printMask(int level, int value) {
        int mask = (int) Math.pow(2, level);
        int levels = countLevels();
        int amoutSpaces = (int) (Math.pow(2, ++levels) / mask);
        String pattern = "%" + (amoutSpaces) + "d%" + (amoutSpaces) + "s";
        System.out.printf(pattern, value, " ");
    }

    public boolean isEmpty() {
        return tab.size() == 0 ? true : false;

    }
}
