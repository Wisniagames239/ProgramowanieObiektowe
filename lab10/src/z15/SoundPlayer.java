package z15;

public interface SoundPlayer {
    void playSound();
    default void stopSound() {
        System.out.println("Sound Stopped");
    }
    static String getDevideType()
    {
        return "Sound Device";
    }
}
