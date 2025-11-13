package org.example.behavioral_patterns.State;

public class TestState {
    public static void main(String[] args) {
        ATMMachineContext atm = new ATMMachineContext();

        System.out.println("Test 1 - Giao dịch thành công: ");
           //Chưa có thẻ
        atm.withdrawCash(100);
        atm.insertCard();          //Đã nhận thẻ
        atm.enterPin(1234);        // PIN đúng

        atm.withdrawCash(500);     //Rút tiền thành công
        atm.ejectCard();           // Trả thẻ

        System.out.println("\nTest 2 - Nhập sai PIN: ");
        atm.insertCard();          //Đã nhận thẻ
        atm.enterPin(9999);        // PIN sai
        atm.withdrawCash(100);     //Chưa xác thực
        atm.enterPin(1234);        // PIN đúng
        atm.withdrawCash(200);     //Rút tiền thành công
        atm.ejectCard();
    }
}
