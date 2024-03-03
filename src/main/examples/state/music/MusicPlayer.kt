package org.example.music

import state.music.MusicPlayState

class MusicPlayer {
    private var state:MusicStateInterface? = null;

    init {
        this.state = MusicPlayState();
    }

    fun setState(state: MusicStateInterface){
        this.state = state;
    }

    fun play() {
        state?.musicPlay(this);
    }

    fun pause() {
        state?.musicPause(this);
    }

    fun stop() {
        state?.musicStop(this);
    }

}