package state.music

import org.example.music.MusicPlayer
import org.example.music.MusicStateInterface

class MusicStopState: MusicStateInterface {
    override fun musicPlay(music: MusicPlayer) {
        println("Iniciando a música.");
        music.setState(MusicPlayState());
    }

    override fun musicPause(music: MusicPlayer) {
        println("Pausando a música.");
        music.setState(MusicPauseState());
    }

    override fun musicStop(music: MusicPlayer) {
        println("A música já terminou.");
    }

}