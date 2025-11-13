package org.example.creational_patterns.Singleton.Database;

import java.sql.Connection;

public class Client {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();

        // Lấy instance thứ hai
        Database db2 = Database.getInstance();

        // Kiểm tra xem có cùng object không
        System.out.println(db1 == db2); //Kết quả: true

        // Lấy connection để truy vấn
        Connection conn = db1.getConnection();
        System.out.println("Connection object: " + conn);
    }
}
