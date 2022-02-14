package java_mini_projects;
import java.util.ArrayList;

class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // Adding songs to playlist.
        desertIslandPlaylist.add("Song #1");
        desertIslandPlaylist.add("Song #2");
        desertIslandPlaylist.add("Song #3");
        desertIslandPlaylist.add("Song #4");
        desertIslandPlaylist.add("Song #5");
        desertIslandPlaylist.add("Song #6");
        desertIslandPlaylist.add("Song #7");
        desertIslandPlaylist.add("Song #8");
        desertIslandPlaylist.add("Song #9");
        desertIslandPlaylist.add("Song #10");
    
    // Printing playlist
        // System.out.println(desertIslandPlaylist);
    
    // Checking playlist size.
        // System.out.println(desertIslandPlaylist.size());
    
    // Removing songs.
        desertIslandPlaylist.remove("Song #2");
        desertIslandPlaylist.remove("Song #3");
        desertIslandPlaylist.remove("Song #5");
        desertIslandPlaylist.remove("Song #7");
        desertIslandPlaylist.remove("Song #9");
    
        // System.out.println(desertIslandPlaylist);
    
    // Swapping songs.
        int indexA = desertIslandPlaylist.indexOf("Song #4");
        int indexB = desertIslandPlaylist.indexOf("Song #6");
    
        String tempA = "Song #4";
    
        desertIslandPlaylist.set(indexA, "Song #6");
        // System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);
    }
}