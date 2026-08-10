package com.parsa.networkmonitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Network Device Monitor\nStarting Application...");

        Device router01 = new Device(1, "Router-01", "192.168.1.1");
        Device switch01 = new Device(2, "Switch-01", "192.168.1.2");
        Device server01 = new Device(3, "Server-01", "192.168.1.3");

        DeviceManager deviceManager = new DeviceManager();
        deviceManager.addDevice(router01);
        deviceManager.addDevice(switch01);
        deviceManager.addDevice(server01);

        List<Device> devices = deviceManager.getAllDevices();
        for (int i = 0; i < devices.size(); i++) {
            System.out.println(devices.get(i));
        }
    }

}