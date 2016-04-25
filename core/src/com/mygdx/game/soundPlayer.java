package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

/**
 * Created by Francesco Nutricato on 4/24/2016.
 */
public class soundPlayer {

    private Music moneySound = Gdx.audio.newMusic(Gdx.files.absolute("moneySound.mp3"));
    private Music tiresNoise = Gdx.audio.newMusic(Gdx.files.internal("tiresNoise.mp3"));
    private  Music collisionNoise = Gdx.audio.newMusic(Gdx.files.internal("crash.mp3"));
    private Music backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("City_Traffic.mp3"));

    public soundPlayer() {}

    public void playTiresNoise() {
        tiresNoise.play();
    }

    public void playCollisionNoise() {
        collisionNoise.setVolume(75);
        collisionNoise.play();
    }


    public void playBackGroundMusic(){
        backgroundMusic.setLooping(true);
        backgroundMusic.setVolume((float)0.1);
        backgroundMusic.play();
    }

    public void playMoneySound() {
        moneySound.play();
    }
}
