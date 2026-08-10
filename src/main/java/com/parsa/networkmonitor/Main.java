package com.parsa.networkmonitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Network Device Monitor\nStarting Application...");

        Device router01 = new Device(1, "Router-01", "192.168.1.1");
        Device switch01 = new Device(2, "Switch-01", "192.168.1.2");
        Device server01 = new Device(3, "Server-01", "192.168.1.3");

        DeviceManager manager = new DeviceManager();
        manager.addDevice(router01);
        manager.addDevice(switch01);
        manager.addDevice(server01);

        NetworkChecker checker = new NetworkChecker();
        manager.checkAllDevices(checker);

        for (Device device : manager.getAllDevices()) {
            System.out.println(device);
        }

        System.out.println("------------------------------------------------\n" +
        manager.findDeviceById(2));
        System.out.println(manager.findDeviceById(99));
    }
}