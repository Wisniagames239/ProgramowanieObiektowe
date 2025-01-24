package Zad3;

public class Test {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play("ODO");
        ap.pause();
        System.out.println(ap.getCurrentTrack());
        VideoPlayer vp = new VideoPlayer();
        vp.play("ODO");
        vp.pause();
        System.out.println(vp.getCurrentTrack());
    }
}
