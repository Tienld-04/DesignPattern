package org.example.behavioral_patterns.Memento;

// Originator
class TextEditor {
    private String content = "";

    public void type(String words) {
        content += words + " ";
    }

    public String getContent() {
        return content;
    }

    public TextMemento save() {
        return new TextMemento(content);
    }

    public void restore(TextMemento memento) {
        content = memento.getContent();
    }
}
