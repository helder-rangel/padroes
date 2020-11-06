package com.padroes.model;

public class Window_With_Horizontal_Scrollbar extends WindowDecorator {

    public Window_With_Horizontal_Scrollbar(Window newjanela) {
        super(newjanela);
    }
    @Override
    public String draw() {
        return "Janela desenhada " + horizontalScrollbar();
    }

    public String horizontalScrollbar(){
        return "com horizontal Scrollbar";
    }
}
