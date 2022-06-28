public class customstack {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;
     int ptr = -1;

    public customstack(){
        this (DEFAULT_SIZE);
    }
    public customstack(int size) {
        this.data  = new int[size];
    }
    public boolean push(int item ){
        if(isfull()){
            System.out.println("Stack is full !!");
            return  false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public boolean isfull(){
        return  ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return  ptr == - 1;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot POP from an empty stack");
        }
//        int removed = data[ptr];
//        ptr = ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot PEEK from an empty stack");
        }
        return data[ptr];
    }

}
