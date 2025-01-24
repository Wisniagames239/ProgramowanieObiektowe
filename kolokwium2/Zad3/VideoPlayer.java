package Zad3;

public class VideoPlayer implements MediaPlayer{
    @Override
    public void play(String trackName) {
        System.out.println("Gram Video");
        System.out.println(trackName);
    }

    @Override
    public void pause() {
        System.out.println("Stop Video");
    }

    @Override
    public String getCurrentTrack() {
        return "Coś z Video";
    }
}
