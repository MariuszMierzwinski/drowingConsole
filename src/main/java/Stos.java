public class Stos implements heap {
    private  static Block downBlock=new Block();
    private  static Block lastBlock=new Block();
    private  static Block nexBlock=new Block();

    public Stos() {

        this.lastBlock.setNextElement(null);
    }

    public Stos(Block downBlock, Block lastBlock) {
        this.downBlock = downBlock;
        this.lastBlock = lastBlock;
    }
public void print(){
    Block block=lastBlock;
    while (block.hasNext()){
        System.out.println(block.getValue());
        block=block.getNextElement();

    }

}
    @Override
    public  void push(String value) {
        if(!(lastBlock.hasNext())){
           lastBlock= new Block(value);
           lastBlock.setNextElement(downBlock);
        }else {
            nexBlock=lastBlock;
            lastBlock=new Block(value);
            lastBlock.setNextElement(nexBlock);
        }

    }

    @Override
    public String pop() {
        if(!(lastBlock.hasNext())){

            lastBlock.setNextElement(null);
            lastBlock=null;
        }else {
            nexBlock=lastBlock;
            lastBlock=lastBlock.getNextElement();
            nexBlock.setNextElement(null);


        }

        return nexBlock.getValue();

    }

    @Override
    public boolean isEmpty() {

        return lastBlock.hasNext() ? false:true;
    }

    @Override
    public int count() {
        int sum=0;
        Block block=lastBlock;
        while (block.hasNext()){
            block=block.getNextElement();
            sum++;
        }
        return sum;
    }
}
