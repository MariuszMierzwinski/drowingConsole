public class ElementListy {
    char value;
    ElementListy next;

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public ElementListy getNext() {
        return next;
    }

    public void setNext(ElementListy next) {
        this.next = next;
    }

    public ElementListy(char value, ElementListy next) {
        this.value = value;
        this.next = next;
    }
    public boolean hasnext(){
        return next!=null;
    }
}
