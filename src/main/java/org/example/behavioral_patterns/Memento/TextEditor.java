package org.example.behavioral_patterns.Memento;

// Originator
class TextEditor {
    private String content = "";  // state

    public void type(String words) {
        content += words + " ";
    }

    public String getContent() {
        return content;
    } //state hiện tại

    public TextMemento save() {
        return new TextMemento(content);
    }  // createMemento

    public void restore(TextMemento memento) {
        content = memento.getContent();
    }
}
