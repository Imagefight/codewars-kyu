// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node {
    public int data;
    public Node next;
    
    public Node(int data, Node next){
        this.next = next;
        this.data = data;
    }
    
}

// FIFO [First in First out]
// Create an Empty Queue
// Determine if the Queue is Empty
// Add a New Item into the Queue
// Remove from the Queue [First Item in Line]
// Add Item into Queue [Last Item in Line]

class Queue {
    Node current, previous;
    
    public Queue(){
        previous = current = new Node(-1, current);
    }
    
    private boolean isEmpty(){
        return (current.next == current);
    }
    
    public void enqueue(int data){
        current  = new Node(data, current.next);
    }
    
    public void dequeue(){
        if (isEmpty()) {System.out.println("Queue is Empty");}
        else{
            previous.next = current.next;
            current = previous;
        }
    }
    
    public int peek(){
        return current.data;
    }
    
}

class Driver {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.peek());
        q.enqueue(5);
        System.out.println(q.peek());
        q.dequeue();
        q.dequeue();
    }
}
