package org.design.patterns.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "vlc" -> advancedMediaPlayer.playVlc(fileName);
            case "mp4" -> advancedMediaPlayer.playMp4(fileName);
        }
    }
}
