package state.music

import org.example.music.MusicPlayer
import org.example.music.MusicStateInterface

class MusicPlayState: MusicStateInterface {
    override fun musicPlay(music: MusicPlayer) {
        println("A música já está sendo reproduzida.");
    }

    override fun musicPause(music: MusicPlayer) {
        println("Pausando a música.");
        music.setState(MusicPauseState());
    }

    override fun musicStop(music: MusicPlayer) {
        println("Parando a música.");
        music.setState(MusicStopState());
    }

}