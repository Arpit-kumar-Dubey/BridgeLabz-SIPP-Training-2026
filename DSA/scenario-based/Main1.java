package LinkedListExample;

public class Main1 {

    public static void main(String[] args) {

        TaskQueue queue = new TaskQueue();

        queue.addTask(101);
        queue.addTask(102);
        queue.addTask(103);
        queue.addTask(104);
        queue.addTask(105);

        System.out.println("Original Task Queue:");
        queue.display();

        queue.removeTask(103);

        System.out.println("\nAfter Removing Task 103:");
        queue.display();
    }
}