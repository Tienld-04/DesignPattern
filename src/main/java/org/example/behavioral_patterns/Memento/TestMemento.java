package org.example.behavioral_patterns.Memento;

public class TestMemento {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        history.save(editor.save()); // State ban đầu

        editor.type("Xin");
        history.save(editor.save());
        System.out.println("Viết: " + editor.getContent());

        editor.type("chào");
        history.save(editor.save());
        System.out.println("Viết: " + editor.getContent());

        editor.type("mọi người!");
        history.save(editor.save());
        System.out.println("Viết: " + editor.getContent());

        // Undo
        System.out.println("\nUndo:");
        editor.restore(history.undo());
        System.out.println("→ " + editor.getContent());

        editor.restore(history.undo());
        System.out.println("→ " + editor.getContent());

        // Redo
        System.out.println("\nRedo:");
        editor.restore(history.redo());
        System.out.println("→ " + editor.getContent());

        // Viết mới sau Undo → xóa Redo
        editor.type("các bạn!");
        history.save(editor.save());
        System.out.println("\nViết mới: " + editor.getContent());

        System.out.println("Redo: " + (history.redo() == null ? "Không còn!" : "OK"));
    }
}
