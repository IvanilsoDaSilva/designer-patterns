package org.example.graphicalinterface

fun main() {
    // Adição dos componentes da interface
    var labelName:Label = Label("Nome");
    var inputName:Input = Input("Nome");
    var labelCpf:Label = Label("Cpf");
    var inputCpf:Input = Input("Cpf");
    var buttonSubmit:Button = Button("Confirmar");
    var painelLogin:Painel = Painel();

    // Renderização de alguns copmponentes
    labelName.renderizar();
    inputCpf.renderizar();
    buttonSubmit.renderizar();

    // Adição dos componentes no painel
    painelLogin.addComponent(labelName);
    painelLogin.addComponent(inputName);
    painelLogin.addComponent(labelCpf);
    painelLogin.addComponent(inputCpf);
    painelLogin.addComponent(buttonSubmit);
    painelLogin.addComponent(painelLogin);

    // Renderização do painel
    painelLogin.renderizar();
}