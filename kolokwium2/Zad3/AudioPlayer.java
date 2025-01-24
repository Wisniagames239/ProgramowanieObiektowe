package Zad3;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String trackName) {
        System.out.println("Gram Audio");
        System.out.println(trackName);
    }

    @Override
    public void pause() {
        System.out.println("Stop Audio");
    }

    @Override
    public String getCurrentTrack() {
        return "Coś z Audio";
    }
}
