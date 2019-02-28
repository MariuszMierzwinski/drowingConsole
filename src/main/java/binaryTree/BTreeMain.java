package binaryTree;

public class BTreeMain {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.printTRee();
        System.out.println("------------------------------------------");
        bt.add("H");
        bt.add("L");
        bt.add("D");
        bt.add("E");
        bt.add("B");
        bt.printTRee();
        System.out.println("------------------------------------------");
    }
}
