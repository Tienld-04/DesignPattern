package org.example.structural_patterns.Facade;

public class PaymentService {
    public void thanhToan(String soThe, double soTien) {
        System.out.println("Thanh toán " + soTien + " VND bằng thẻ " + soThe);
    }
}
