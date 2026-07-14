package LinkedListExample;

public class Playlist {

    Node head;
    public void addTrack(int trackId) {

        Node newNode = new Node(trackId);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public Node findTrack(int trackId) {

        Node temp = head;

        while (temp != null) {

            if (temp.trackId == trackId) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }
    public void insertAfter(Node current, int newTrackId) {

        if (current == null) {
            System.out.println("Current track not found.");
            return;
        }

        Node newNode = new Node(newTrackId);

        newNode.next = current.next;

        current.next = newNode;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.trackId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}