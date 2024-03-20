package org.example.filesystem

fun main() {
    // Criando arquivos
    val file1 = File("documento.txt")
    val file2 = File("imagem.png")

    // Criando diretórios
    val dir1 = Directory("Documentos")
    val dir2 = Directory("Imagens")

    // Adicionando arquivos aos diretórios
    dir1.addChildren(file1)
    dir2.addChildren(file2)

    // Criando um diretório principal e adicionando os subdiretórios
    val root = Directory("C:")
    root.addChildren(dir1)
    root.addChildren(dir2)

    // Mostrando a estrutura do diretório
    root.showInfo()
}