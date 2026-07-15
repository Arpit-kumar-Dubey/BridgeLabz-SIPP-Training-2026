package Stack;

public class Main {

    public static void main(String[] args) {

        UndoBuffer buffer = new UndoBuffer(5);

        buffer.push("Typed Hello");
        buffer.push("Typed World");
        buffer.push("Deleted World");
        buffer.push("Typed Java");
        buffer.push("Saved File");

        buffer.push("Closed File");

        System.out.println();

        System.out.println("Latest Action : " + buffer.peek());

        System.out.println();

        System.out.println("Undo : " + buffer.pop());
        System.out.println("Undo : " + buffer.pop());

        System.out.println();

        buffer.display();
    }
}