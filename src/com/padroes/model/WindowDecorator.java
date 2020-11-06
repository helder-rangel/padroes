package com.padroes.model;

public class WindowDecorator implements Window {

    protected Window janela;

    public  WindowDecorator(Window janela){
        janela = this.janela;

    }

    public String draw(){
        return janela.draw();
    }

}
