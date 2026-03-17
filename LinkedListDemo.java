import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        // // ----- Queue using LinkedList -----
        //LinkedList<String> queue = new LinkedList<>();

        // // Enqueue (add elements to the end)
        //queue.add("Alice");
        //System.out.println("Queue: " + queue);
        // queue.add("Bob");
        // queue.add("Charlie");

        // System.out.println("Queue: " + queue);

        // Poll (remove element from the front, also returns element from the front, if queue empty returns null)
        // String first = queue.poll();
        // System.out.println("Dequeued: " + first);
        // System.out.println("Queue after dequeue: " + queue);

        // Peek (look at the front element)
        //System.out.println("Front of queue: " + queue.peek());

        // ----- Stack using LinkedList -----
        LinkedList<Integer> stack = new LinkedList<>();

        // Push (add elements to the top)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);

        // Pop (remove the top element)
        int top = stack.pop();
        System.out.println("Popped: " + top);
        System.out.println("Stack after pop: " + stack);

        // Peek (look at the top element)
        System.out.println("Top of stack: " + stack.peek());

        System.out.println("Top of stack: " + stack.isEmpty());
    }
}