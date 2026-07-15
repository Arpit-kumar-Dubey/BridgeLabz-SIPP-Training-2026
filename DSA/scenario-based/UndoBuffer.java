package Stack;

public class UndoBuffer {

    private String[] data;
    private int top;

    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public void push(String action) {

        if (top == data.length - 1) {
            System.out.println("Undo Buffer is Full! Cannot record new action.");
            return;
        }

        top++;
        data[top] = action;

        System.out.println(action + " added to Undo Buffer.");
    }

    public String pop() {

        if (top == -1) {
            System.out.println("Undo Buffer is Empty! Nothing to undo.");
            return null;
        }

        String action = data[top];
        top--;

        return action;
    }

    public String peek() {

        if (top == -1) {
            System.out.println("Undo Buffer is Empty!");
            return null;
        }

        return data[top];
    }

    public void display() {

        if (top == -1) {
            System.out.println("Undo Buffer is Empty.");
            return;
        }

        System.out.println("\nCurrent Undo Buffer:");

        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
