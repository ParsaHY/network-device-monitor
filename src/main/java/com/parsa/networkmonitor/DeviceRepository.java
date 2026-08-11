package com.parsa.networkmonitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeviceRepository {

    public void save(Device device) {

        String sql = """
                INSERT INTO devices (id, name, ip_address, status)
                VALUES (?, ?, ?, ?)
                """;

        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, device.getId());
            statement.setString(2, device.getName());
            statement.setString(3, device.getIpAddress());
            statement.setString(4, device.getStatus().name());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}