/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Furkan Kaan Alkan
 * Student ID:  240444034
 * Date:        05/10/2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // TODO: Create one Track object using EACH of the four constructors.
        //       Print each track's toString() result.
        //       Also test getDurationFormatted() and individual getters.
        //       Test the invalid-duration case (negative value).

        // --- Default constructor ---
        Track defaultTrack = new Track();
        System.out.println("Default Track: \n" + defaultTrack.toString() + "\n");

        // --- Title-only constructor ---
        Track titleTrack = new Track("Neon Lights");
        System.out.println("Title-only track:\n" + titleTrack.toString() + "\n");

        // --- Title + artist constructor ---
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:\n" + titleArtistTrack.toString() + "\n");

        // --- Full constructor ---
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):\n" + fullTrack.toString() + "\n");

        // --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -15, false);
        System.out.println(invalidTrack.toString() + "\n");

        // --- Getter test ---
        System.out.println("Getter Test:");
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.getIsExplicit());
    }
}
