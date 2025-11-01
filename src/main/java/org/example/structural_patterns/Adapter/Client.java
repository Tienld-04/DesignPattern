package org.example.structural_patterns.Adapter;

public class Client {
    private final IVietnameseTarget target;

    public Client(IVietnameseTarget target) {
        this.target = target;
    }

    public void communicate(String words) {
        target.send(words);
    }

//    public static void main(String[] args) {
//        IVietnameseTarget vietnameseTarget = new TranslatorAdapter(new EnglishAdaptee());
//        vietnameseTarget.send("Xin chào");
//
//    }
}
