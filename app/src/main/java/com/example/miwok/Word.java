package com.example.miwok;

import android.media.Image;

public class Word {

    private String EnglishTranslation;
    private String MiwokTranslation;
    private int imageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int soundId;

    public Word(String English, String Miwok, int SoundId) {
        EnglishTranslation = English;
        MiwokTranslation = Miwok;
        soundId = SoundId;
    }

    public Word(String English, String Miwok, int Image, int SoundId) {
        EnglishTranslation = English;
        MiwokTranslation = Miwok;
        imageId = Image;
        soundId = SoundId;
    }

    public String getDefaultTranslation() {
        return EnglishTranslation;
    }

    public String getMiwokTranslation() {
        return MiwokTranslation;
    }

    public int getImageId() {
        return imageId;
    }
    public int getSoundId() {
        return soundId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE_PROVIDED;
    }
}
