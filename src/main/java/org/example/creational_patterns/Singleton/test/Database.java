package org.example.creational_patterns.Singleton.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    // Biến static duy nhất lưu instance
    private static volatile Database instance;
    // Biến kết nối JDBC
    private Connection connection;
    // Constructor private để ngăn tạo đối tượng từ bên ngoài
    private Database() {
        try {
            String url = "jdbc:mysql://localhost:3306/smart_diary";
            String user = "root";
            String password = "123456";
            // Tạo kết nối
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối Database thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Phương thức public để truy cập duy nhất 1 instance
    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
    // Phương thức để lấy connection (nếu cần)
    public Connection getConnection() {
        return connection;
    }
}