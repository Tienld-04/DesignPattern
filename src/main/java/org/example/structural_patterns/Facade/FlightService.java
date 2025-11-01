package org.example.structural_patterns.Facade;

public class FlightService {
    public boolean kiemTraChuyenBay(String maChuyenBay) {
        System.out.println("Kiểm tra chỗ trống cho chuyến bay " + maChuyenBay + "...");
        return true;
    }
}
