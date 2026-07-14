package LinkedListExample;

public class TaskQueue {

    Node1 head;

    public void addTask(int taskId) {

        Node1 newNode = new Node1(taskId);

        if (head == null) {
            head = newNode;
            return;
        }

        Node1 temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void removeTask(int taskId) {

        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            return;
        }

        Node1 prev = head;
        Node1 curr = head.next;

        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        } else {
            System.out.println("Task not found.");
        }
    }

    public void display() {

        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.taskId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}