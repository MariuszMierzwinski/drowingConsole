package binaryTree;

import treee.Node;

import java.util.LinkedList;

public class BinaryTree {

    private BinaryNode root;

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    public BinaryTree() {

    }

    public BinaryNode getRoot() {
        return this.root;
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }



    public void add(String value){
        if(root==null){
            root=new BinaryNode(value);
            return;
        }
        chooseSide(new BinaryNode(value),root);
        //Node currentNode=root;

    }
private void chooseSide(BinaryNode newNode,BinaryNode currentNode){
    int result = newNode.getValue().compareTo(currentNode.getValue());
    if(result<0){
        addToLeft(newNode,currentNode);
    }else{
        addToRight(newNode,currentNode);
    }
}
    private void addToRight(BinaryNode newNode, BinaryNode parentNode) {
        if(parentNode.hasRightChilde()){
            chooseSide(newNode,parentNode.getRightChild());
        }else{
            parentNode.setRightChild(newNode);
            newNode.setParent(parentNode);
        }
    }

    private void addToLeft(BinaryNode newNode, BinaryNode parentNode) {
        if(parentNode.hasLefttChilde()){
            chooseSide(newNode,parentNode.getLeftChild());
        }else{
            parentNode.setLeftChild(newNode);
            newNode.setParent(parentNode);
        }
        
    }
    public void printChilds(BinaryNode node){
        if (!node.hasLefttChilde()&&!node.hasRightChilde()){
            System.out.println(String.format("Node %s is a leaf.",node.getValue()));
        }else{
            if (node.hasLefttChilde()){
                System.out.println(String.format("Node %s has  left node.",node.getValue(),node.getLeftChild().getValue()));
                printChilds(node.getLeftChild());
            }
            if (node.hasRightChilde()){
                System.out.println(String.format("Node %s has  right node.",node.getValue(),node.getRightChild().getValue()));
                printChilds(node.getRightChild());
            }
        }

    }

    public void findPlace(String key) {
        BinaryNode actual = null;
        BinaryNode parent=null;
        if(root==null){
            root=new BinaryNode(key);
            root.setParent(null);
        }else
            actual=root;
            parent=null;
            while (actual!=null){
                parent=actual;
                if(actual.getValue().compareTo(key)==-1){
                    actual=actual.getLeftChild();
                }
                if(actual.getValue().compareTo(key)==1){
                    actual=actual.getRightChild();
                }
            }
            if(parent.getValue().compareTo(key)==-1){
                parent.setLeftChild(new BinaryNode(key));
            }else if (parent.getValue().compareTo(key)==1){
                parent.setRightChild(new BinaryNode(key));
            }

    }

    public void addBinaryNode(String key) {
     this.findPlace(key);

    }

    public void printAllAntecessor(BinaryNode node){
        if (!node.hasParent()){
            System.out.println("No more antexessors.");
        }else{
            printAllAntecessor(node.getParent());
            System.out.println("Antcessor's name" +node.getValue());
        }
    }
    public void printTRee() {
        if (root==null){
            System.out.println("Puste");
        }else  printChilds(root);
    }
    public void search(String key){
        BinaryNode founded=search(key,root,0);
        printAllAntecessor(founded);
    }

    private BinaryNode search(String key, BinaryNode node, int level) {
        if (node==null){
            System.out.println("???");
            return null;
        }
        int result=node.getValue().compareTo(key);
        if (result<0){
            node =search(key,node.getLeftChild(),level++);

        }else  if (result>0){
            node =search(key,node.getRightChild(),level++);

        }
        return null;
    }
}

