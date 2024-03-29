package org.example.music

class MusicPlayState: MusicStateInterface {
    public override fun musicPlay(music: MusicPlayer) {
        println("A música já está sendo reproduzida.");
    }

    public override fun musicPause(music: MusicPlayer) {
        println("Pausando a música.");
        music.setState(MusicPauseState());
    }

    public override fun musicStop(music: MusicPlayer) {
        println("Parando a música.");
        music.setState(MusicStopState());
    }
}