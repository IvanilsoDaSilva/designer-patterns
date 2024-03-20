package org.example.music

interface MusicStateInterface {
    fun musicPlay(music:MusicPlayer)
    fun musicPause(music:MusicPlayer)
    fun musicStop(music:MusicPlayer)
}