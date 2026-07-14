package LinkedListExample;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.addTrack(101);
        playlist.addTrack(102);
        playlist.addTrack(103);
        playlist.addTrack(104);

        System.out.println("Original Playlist:");
        playlist.display();

        Node current = playlist.findTrack(102);

        playlist.insertAfter(current, 999);

        System.out.println("\nPlaylist After Insertion:");
        playlist.display();
    }
}