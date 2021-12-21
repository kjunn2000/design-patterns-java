package com.moodyjun.state;

public class HTMLEditor {
    private HTMLEditorState state;

    public HTMLEditorState getState() {
        return state;
    }

    public void setState(HTMLEditorState state) {
        this.state = state;
    }

    public void view(){
        state.view();
    }
}
