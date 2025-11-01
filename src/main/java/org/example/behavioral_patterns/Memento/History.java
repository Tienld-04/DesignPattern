package org.example.behavioral_patterns.Memento;

import java.util.Stack;

// Caretaker
class History {
    private final Stack<TextMemento> undoStack = new Stack<>();
    private final Stack<TextMemento> redoStack = new Stack<>();

    public void save(TextMemento memento) {
        undoStack.push(memento);
        redoStack.clear();
    }

    public TextMemento undo() {
        if (undoStack.size() <= 1) return null;
        redoStack.push(undoStack.pop());
        return undoStack.peek();
    }

    public TextMemento redo() {
        if (redoStack.isEmpty()) return null;
        TextMemento memento = redoStack.pop();
        undoStack.push(memento);
        return memento;
    }
}