package com.padroes.model;

public class Window_With_Vertical_and_Horizontal_Scrollbar_and_Border extends WindowDecorator {

    public Window_With_Vertical_and_Horizontal_Scrollbar_and_Border(Window newjanela) {
        super(newjanela);
        System.out.println("Desenhar janela com Vertical e horizontal Scrollbar e border");
    }

    @Override
    public String draw() {
        return "Janela desenhada " + verticalScroolbarAndHorizontalAndBorder() ;
    }

    public String verticalScroolbarAndHorizontalAndBorder(){
        return "com vertical and horizontal Scrollbar and border";
    }


}
