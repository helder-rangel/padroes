package com.padroes.model;

public class Window_With_Vertical_and_Horizontal_Scrollbar extends WindowDecorator {
    public Window_With_Vertical_and_Horizontal_Scrollbar(Window newjanela) {
        super(newjanela);
        System.out.println("Desenhar janela com vertical e horizontal Scrollbar");
    }

    @Override
    public String draw() {
        return "Janela desenhada " + verticalScroolbarAndHorizontal();
    }

    public String verticalScroolbarAndHorizontal(){
        return "com vertical and horizontal Scrollbar";
    }

}
