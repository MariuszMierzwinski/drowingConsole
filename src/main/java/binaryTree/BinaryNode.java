package binaryTree;

import treee.Node;

public class BinaryNode {
    private BinaryNode parent;
    private BinaryNode leftChild;
    private BinaryNode rightChild;
    private String value;

    public BinaryNode(BinaryNode parent, BinaryNode leftChild, BinaryNode rightChild, String value) {
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.value = value;
    }
    public BinaryNode(String key){
        this.value=key;
    }

    public BinaryNode getParent() {
        return parent;
    }

    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryNode rightChild) {
        this.rightChild = rightChild;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public int hasChildren(){
        if((this.leftChild!=null)&&(this.rightChild==null)) return 1; //ma nastepnika
        else if ((this.leftChild!=null)&&(this.rightChild==null)) return -1; //ma  poprzednika
        return 0; //ma obu
    }

    public boolean hasRightChilde() {
        return (this.rightChild!=(null));
    }

    public boolean hasLefttChilde() {
        return (this.leftChild!=(null));
    }

    public boolean hasParent() {
        return this.parent!=null;
    }
}
