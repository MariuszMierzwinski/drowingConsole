public class Block {private String value;
    private Block nextElement;

    public Block(String value) {
        this.value = value;
        this.nextElement = null;
    }

    public Block() {
        value = "Not define";
        nextElement = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Block getNextElement() {
        return nextElement;
    }

    public void setNextElement(Block nextElement) {
        this.nextElement = nextElement;
    }

    public boolean hasNext(){
        return nextElement != null;
    }


}
