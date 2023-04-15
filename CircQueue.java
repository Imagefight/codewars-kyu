class Queue{
    private int front, rear, len;
    private int[] queue;
    
    // Constructor
    public Queue(int size){
        this.front = this.rear = -1;
        this.len   = size;
        this.queue = new int[len];
    }
    
    // Adds a Value to the queue
    public void enqueue(int val){
        // Check if the Queue is Full or Empty
        if (isFull()) {System.out.println("Queue is Full");} 
        else if (isEmpty()) {front++;}
        
        // Assign the Rear to the next position then add the value
        rear = nextPos(rear);
        queue[rear] = val;
    }
    
    // Removes a Value from the Queue
    public void dequeue(){
        // If the front and rear are the same, the queue is/will be emptied
        if (front == rear){
            // Mark the array as Empty with -1 as the pos
            front = rear = -1;
            System.out.println("Queue is Empty");
        } else {
            front = nextPos(front);
        }
    }
    // Shows what's at the front of the Queue
    public int peek(){
        if (isEmpty()) {System.out.println("Queue is Empty");}
        else {return queue[front];}
        
        // Inaccessable Return Statement
        return 0;
    }
    
    // Caclulates the Next Position in the Queue
    int nextPos(int val){
        return ((val + 1) % len);
    }
    
    // Shows if the queue is Empty
    boolean isEmpty(){
        return front == -1;
    }
    
    // Shows if the queue is Full
    boolean isFull(){
        // If the next position for rear will equal front, it is full.
        return (nextPos(rear) == front);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        
        System.out.println(q.peek());
        q.enqueue(5);
        q.enqueue(5);
        q.enqueue(5);
        System.out.println(q.peek());
        q.enqueue(5);
        q.enqueue(5);
        q.enqueue(5);
        System.out.println(q.peek());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
