package treee;

import java.util.LinkedList;

public class Node {
    private Node parent;
    private LinkedList<Node> children= new LinkedList<>();
    private String value;

    public Node(Node parent, String value) {
        this.parent = parent;
        this.value = value;
    }

    public Node() {
        this.parent = null;
        this.value = "empty";
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public LinkedList<Node> getChildren() {
        return children;
    }

    public void setChildren(Node child) {
        this.children.add(child);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

   public Boolean isLeaf(){
        return this.children.isEmpty();
   }

   public void removeNode(Node node){
        this.children.remove(node);

   }
    public void printNode() {

        if (this.parent == null) {
            System.out.println("Korzen : " +getValue());
        } else {
            System.out.println("potomek : "+ getValue());
        }
        if (children != null) {
            this.children.stream()
                    .map(s -> "   CH:" +s.getValue())
                    .forEach(System.out::print);
        }
        System.out.println();

    }
}
