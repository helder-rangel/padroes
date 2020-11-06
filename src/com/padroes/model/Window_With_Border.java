package com.padroes.model;

public class Window_With_Border extends WindowDecorator {

    private String window ="Desenhar janela com borda";


    public Window_With_Border(String window) {
        super(janela);
        System.out.println(window);
    }


    @Override
    public String draw() {
        return "Janela desenhada " + border();
    }

    public String border(){
        return "com border";
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "Window_With_Border{" +
                "window='" + window + '\'' +
                '}';
    }
}
