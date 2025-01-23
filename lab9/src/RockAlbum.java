import java.util.ArrayList;
import java.util.Objects;

public class RockAlbum extends MusicAlbum {
    private String rockGentre;
    public RockAlbum(String title, String artist, ArrayList<Double> ratings, String rockGentre) {
        super(title,artist,ratings);
        this.rockGentre = rockGentre;
    }
    public RockAlbum(String title, String artist, String rockGentre) {
        super(title,artist);
        this.rockGentre = rockGentre;
    }
    public String getRockGentre() {
        return rockGentre;
    }
    public void setRockGentre(String rockGentre) {
        this.rockGentre = rockGentre;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rockGentre='" + rockGentre + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        RockAlbum other = (RockAlbum) o;
        return rockGentre !=null ? rockGentre.equals(other.rockGentre) : other.rockGentre == null;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+ (rockGentre!=null?rockGentre.hashCode():0);
    }
}
