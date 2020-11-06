package com.padroes.model;

public class Window_With_Vertical_Scrollbar extends WindowDecorator {

    public Window_With_Vertical_Scrollbar(Window newjanela) {
        super(newjanela);
        System.out.println("Desenhar janela com vertical scrollbar");
    }

    @Override
    public String draw() {
        return "Janela desenhada " + verticalScroolbar();
    }

    public String verticalScroolbar(){
        return "com vertical Scrollbar";
    }


}
