package org.example.music

class MusicStopState: MusicStateInterface {
    public override fun musicPlay(music: MusicPlayer) {
        println("Iniciando a música.");
        music.setState(MusicPlayState());
    }

    public override fun musicPause(music: MusicPlayer) {
        println("Pausando a música.");
        music.setState(MusicPauseState());
    }

    public override fun musicStop(music: MusicPlayer) {
        println("A música já terminou.");
    }
}