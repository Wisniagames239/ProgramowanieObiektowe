import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private ArrayList<Double> ratings;
    public MusicAlbum(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.ratings = new ArrayList<Double>();
    }
    public MusicAlbum(String title, String artist, ArrayList<Double> ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = ratings;
    }

    public void dodajOcene(double ocena) {
        this.ratings.add(ocena);
    }
    public void usunOcene(double ocena) {
        if(ratings!=null||!ratings.isEmpty())
        {
            if (ratings.contains(ocena)) {
                ratings.remove(ratings.indexOf(ocena));
            } else {
                return;
            }  }

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        return Objects.equals(title, that.title) && Objects.equals(artist, that.artist) && Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + (title != null ? title.hashCode() : 0);
        result = 31*result + (artist != null ? artist.hashCode() : 0);
        result = 31*result + (ratings != null ? ratings.hashCode() : 0);
        return result;
    }
}
