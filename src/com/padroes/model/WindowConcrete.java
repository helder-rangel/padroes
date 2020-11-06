package com.padroes.model;

public class WindowConcrete implements Window {

    private Window janela = null;

    public WindowConcrete(Window janela) {
       janela = this.janela;
       System.out.println("Desenhar janela");

    }

    @Override
    public String draw() {
        return "Janela desenhada";
    }

}
