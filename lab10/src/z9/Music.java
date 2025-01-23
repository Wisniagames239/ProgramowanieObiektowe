package z9;

import java.util.Arrays;

public class Music implements Comparable<Music>{
    String title;
    String artist;
    int releaseYear;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

    @Override
    public int compareTo(Music o) {
        return this.releaseYear - o.releaseYear;
    }
}
class TestMusic{
    public static void main(String[] args) {
        Music[] m1 = {new Music("AA","AA",2003), new Music("BB","BB",2005), new Music("CC","CC",2001), new Music("DD","DD",2003)};
        Arrays.sort(m1);
        System.out.println(Arrays.toString(m1));
    }
}
