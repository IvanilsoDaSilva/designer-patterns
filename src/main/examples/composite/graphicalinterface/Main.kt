package org.example.graphicalinterface

fun main() {
    var labelName:Label = Label("Nome");
    var inputName:Input = Input("Nome");

    var labelCpf:Label = Label("Cpf");
    var inputCpf:Input = Input("Cpf");

    var buttonSubmit:Button = Button("Confirmar");

    var painelLogin:Painel = Painel();

    labelName.renderizar();
    inputCpf.renderizar();
    buttonSubmit.renderizar();

    painelLogin.addComponent(labelName);
    painelLogin.addComponent(inputName);
    painelLogin.addComponent(labelCpf);
    painelLogin.addComponent(inputCpf);
    painelLogin.addComponent(buttonSubmit);
    painelLogin.addComponent(painelLogin);

    painelLogin.renderizar()
}