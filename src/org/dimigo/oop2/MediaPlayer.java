package org.dimigo.oop2;

public class MediaPlayer {
    private static int volume;
    private static MediaPlayer instance = new MediaPlayer();

//    private MediaPlayer;

    public static MediaPlayer getInstance() {
        return instance;
    }

    public static int getVolume() {
        return volume;
    }

    public static void setVolume(int volume) {
        MediaPlayer.volume = volume;
    }
}
