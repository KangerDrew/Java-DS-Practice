public class Queue <T> implements Iterable <T> {

    private java.util.LinkedList <T> list = new java.util.LinkedList <T> ();

    public Queue() {}

    public Queue(T firstElem) {
        offer(firstElem);
    }

    // Return the size of the queue
    public int size() {
        return list.size()
    }

    // Returns whether or not the queue is empty

    public boolean isEmpty(){
        return size() == 0;
    }

    // Peek the element at the front of the queue
    // If queue is empty, throw an error

    public T peek() {
        if(isEmpty())
            throw new RuntimeException("Queue Empty");
        return list.peekFirst();
    }
    // Poll an element from the front of the queue
    // If queue is empty, throw an error
    public T poll() {
        if(isEmpty())
            throw new RuntimeException("Queue Empty");
        return list.removeFirst();
    }


}