package treee;

import java.util.LinkedList;

public class Tree {
    private LinkedList<Node> tree;



    public Tree(LinkedList<Node> tree) {
        this.tree = tree;
    }

    public LinkedList<Node> getTree() {
        return tree;
    }

    public void setTree(LinkedList<Node> tree) {
        this.tree = tree;
    }
}
