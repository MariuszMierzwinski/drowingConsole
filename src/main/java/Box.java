public class Box extends Block {
    private Block prevElement;

    public Box(String value, Block prevElement) {
        super(value);
        this.prevElement = prevElement;
    }

    public Box(Block prevElement) {
        this.prevElement = prevElement;
    }

    public Box() {
        super("Empty");
    }

    public Block getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(Block prevElement) {
        this.prevElement = prevElement;
    }
}
