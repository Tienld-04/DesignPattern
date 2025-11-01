package org.example.structural_patterns.Facade;

public class Client {
    public static void main(String[] args) {
        BookingFacade facade = new BookingFacade();
        facade.datVe("Nguyễn Văn A", "VN123", "1234-5678", 2500000, "vana@gmail.com");
    }
}
