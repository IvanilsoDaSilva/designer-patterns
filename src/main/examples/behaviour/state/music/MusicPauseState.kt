package org.example.music

class MusicPauseState: MusicStateInterface {
    public override fun musicPlay(music: MusicPlayer) {
        println("Iniciando a música.");
        music.setState(MusicPlayState());
    }

    public override fun musicPause(music: MusicPlayer) {
        println("A música já esta pausada.");
    }

    public override fun musicStop(music: MusicPlayer) {
        println("Parando a música.");
        music.setState(MusicStopState());
    }
}