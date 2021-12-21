package com.moodyjun.state;

public class Main {
    public static void main(String[] args) {
        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setState(new DesignView());
        htmlEditor.view();
        htmlEditor.setState(new HTMLView());
        htmlEditor.view();
        htmlEditor.setState(new Preview());
        htmlEditor.view();
    }
}
