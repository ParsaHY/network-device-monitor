package com.parsa.networkmonitor;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Network Device Monitor\nStarting Application...\n");

        // Device router01 = new Device(1, "Router-01", "192.168.1.1");
        // Device switch01 = new Device(2, "Switch-01", "192.168.1.2");
        // Device server01 = new Device(3, "Server-01", "192.168.1.3");

        // DeviceManager manager = new DeviceManager();
        // manager.addDevice(router01);
        // manager.addDevice(switch01);
        // manager.addDevice(server01);

        // NetworkChecker checker = new NetworkChecker();
        // manager.checkAllDevices(checker);

        // for (Device device : manager.getAllDevices()) {
        //     System.out.println(device);
        // }

        // System.out.println("----------------------------------------------------------------------\n" +
        //         manager.findDeviceById(2));
        // System.out.println(manager.findDeviceById(99));
        // System.out.println("----------------------------------------------------------------------");

        // try {
        //     Connection connection = DatabaseConnection.getConnection();
        //     System.out.println("Database connection successful.");
        //     connection.close();
        // } catch (SQLException e) {
        //     System.out.println("Database connection failed.");
        //     e.printStackTrace();
        // }

        System.out.println("----------------------------------------------------------------------");
        
        Device testDevice = new Device(10, "Test-Router", "8.8.8.8");
        DeviceRepository repository = new DeviceRepository();
        repository.save(testDevice);
    }
}