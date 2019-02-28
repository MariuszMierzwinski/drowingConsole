public class Queue implements SdaQueue{
    private Box front;


    public Queue(){
        this.front=new Box();
        this.back=new Box();
        front.setPrevElement(back);
        back.setNextElement(front);
        front.setNextElement(null);
        back.setPrevElement(null);
    }
    public Queue(Box front, Box back) {
        this.front = front;
        this.back = back;
    }

    private Box back;
    @Override
    public void add(Box element) {
        Box next;
        if(front.getPrevElement()==back){
            front=back=element;
            front.setNextElement(null);
            back.setPrevElement(null);
        }else {
            next=front;
            front=element;
            front.setPrevElement(next);
            front.setNextElement(null);
        }

    }

    @Override
    public String get() {
        Box next;
        next= (Box) front.getPrevElement();
        return front.getValue();

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }
}
