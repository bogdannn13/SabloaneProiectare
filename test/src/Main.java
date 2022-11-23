import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new Song("BudaBar", 3000));
        p.add(new Video("Waves in Caraibe", 2000));
        p.add(new Song("Simple things", 4000));
        p.add(new Gif("Sunglasses", 500));
        m.add(p);

    }
}
