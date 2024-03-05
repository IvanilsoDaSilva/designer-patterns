package org.example.music

fun main() {
    // Criação do objeto
    val player:MusicPlayer = MusicPlayer()

    // Tenta reproduzir a música
    player.play();

    // Pausa a música
    player.pause();

    // Tenta pausar novamente (não deve ter efeito)
    player.pause();

    // Tenta parar a música
    player.stop();

    // Tenta parar novamente (não deve ter efeito)
    player.stop();
}