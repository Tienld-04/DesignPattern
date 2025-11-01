package org.example.structural_patterns.Adapter;

public class Mian {
    public static void main(String[] args) {
        EnglishAdaptee adaptee = new EnglishAdaptee();
        IVietnameseTarget target = new TranslatorAdapter(adaptee);
        Client client = new Client(target);

        client.communicate("Xin chào");
    }
}
