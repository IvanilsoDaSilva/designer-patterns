package org.example.music

class MusicPlayer {
    private var state:MusicStateInterface? = null;

    init {
        this.state = MusicPlayState();
    }

    public fun setState(state: MusicStateInterface){
        this.state = state;
    }

    public fun play() {
        state?.musicPlay(this);
    }

    public fun pause() {
        state?.musicPause(this);
    }

    public fun stop() {
        state?.musicStop(this);
    }
}