package queue_Building;

public class Queues {
    private Object[] array ;
        private int total = 0;
        private int size = 5;
        private int firstEntered = 0;
        private int front = 0;

        public Queues(){
            this.size = size;
            this.array = new Object[size];
        }
        public Queues(int size){
          this.array = new String[size];
        }

    public boolean isEmpty() {
        boolean isSizeIsEqualToArrayLength = total == 0;
        if(isSizeIsEqualToArrayLength) return true;
        return false;
    }

    public void enqueue(Object input) {
        if(!isFull()){
            total++;
            array[firstEntered] = input;
            firstEntered = ( firstEntered + 1) % size ;
            System.out.println(firstEntered);
            System.out.println(size);
        }else  throw new RuntimeException("queue is full");
    }

    public Object dequeue() {
       Object value = array[front];
        total--;
        front = (front + 1) % size;
        System.out.println(front);
        return value;
    }
    public boolean isFull(){
        if(total == array.length)return true;
        return false;
    }
}
