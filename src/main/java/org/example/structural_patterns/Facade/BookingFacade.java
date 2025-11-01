package org.example.structural_patterns.Facade;

public class BookingFacade {
    private FlightService flightService;
    private CustomerService customerService;
    private PaymentService paymentService;
    private EmailService emailService;

    public BookingFacade() {
        flightService = new FlightService();
        customerService = new CustomerService();
        paymentService = new PaymentService();
        emailService = new EmailService();
    }

    public void datVe(String tenKhach, String maChuyenBay, String soThe, double soTien, String email) {
        System.out.println("Bắt đầu quy trình đặt vé:");
        if (flightService.kiemTraChuyenBay(maChuyenBay)) {
            customerService.taoHoSoKhachHang(tenKhach);
            paymentService.thanhToan(soThe, soTien);
            emailService.guiEmailXacNhan(email);
            System.out.println("Đặt vé thành công cho khách hàng: " + tenKhach);
        } else {
            System.out.println("Chuyến bay không còn chỗ trống!");
        }
        System.out.println("Kết thúc quy trình đặt vé ");
    }
}
