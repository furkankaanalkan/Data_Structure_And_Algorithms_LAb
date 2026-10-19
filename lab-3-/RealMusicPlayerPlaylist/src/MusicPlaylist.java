/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        19/10/2026
 */

public class MusicPlaylist {

    //create private instants of the doubly linked list: 
    // -  head, tail and current
    SongNode head;
    SongNode tail;
    SongNode current;

    // constructor: The head,tail and current should be initialized to null in the beginning
    public MusicPlaylist() {
        head = null;
        tail = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {
        
        SongNode newSong = new SongNode(title);

        if (head == null){
            head = newSong;
            tail = newSong;
            current = newSong;
        }
        else{
            newSong.prev = tail;
            tail.next = newSong;
            tail = newSong;
        }
        // TODO
        // 1. Create a new SongNode
        // 2. If the playlist is empty, make the new node
        //    head, tail and current
        // 3. Otherwise, add the new node after tail
        // 4. Update both next and prev pointer
        // 5. Update tail
    }


    // Remove a song from the playlist
    public void removeSong(String title) {
        
        SongNode tempCurrent = head;

        while (tempCurrent != null){
            
            if (head.title.equals(title)){
                head = head.next;
                tempCurrent.prev = null;
                return;
            }
            else if (tail.title.equals(title)){
                tempCurrent.prev.next = null;
                tail = tempCurrent.prev;
                return;
            }
            else if (tempCurrent.title.equals(title)){
                tempCurrent.prev.next = tempCurrent.next;
                tempCurrent.next.prev = tempCurrent.prev;
                return;
            }
            else if (tempCurrent.next == null && tempCurrent.title.equals(title)){
                System.out.println("The song isn't in the playlist");
            }
            tempCurrent = tempCurrent.next;
        }
        // TODO
        // 1. Search for the song
        // 2. If the song does not exist, display a message as: "The song isn't in the playlist"
        // 3. Update the previous node's next pointer
        // 4. Update the next node's prev pointer
        // 5. Handle removing head
        // 6. Handle removing tail
        // 7. Handle removing the current song
    }


    // Move to the next song
    public void nextSong() {
        if (current != null && current.next != null){
            current = current.next;
            System.out.println("Playing: " + current.title);
        }
        else{
           System.out.println("Already at the last song of the playlist."); 
        } 
        // TODO
        // If current is not null and current.next exists,
        // move current to current.next.
        //
        // Otherwise, display:
        // "Already at the last song of the playlist."
    }


    // Move to the previous song
    public void previousSong() {

        if (current != null && current.prev != null){
            current = current.prev;
            System.out.println("Playing: " + current.title);

        }
        else{
           System.out.println("Already at the first song of the playlist."); 
        } 
        // TODO
        // If current is not null and current.prev exists,
        // move current to current.prev.
        //
        // Otherwise, display:
        // "Already at the first song of the playlist."
    }


    // Display the current song
    public void displayCurrentSong() {
        if (current != null){
        System.out.println("Current Song: " + current.title);
    }
        // TODO
        // Display the title of the current song.
    }


    // Display all songs
    public void displayPlaylist() {
        SongNode tempCurrent = head;
        while (tempCurrent != null) {
            System.out.println(tempCurrent.title + "-->");
            tempCurrent = tempCurrent.next;
        }
        // TODO
        // Start from head and follow next pointer.
    }
}
