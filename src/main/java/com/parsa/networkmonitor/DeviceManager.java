package com.parsa.networkmonitor;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private List<Device> devices;

    public DeviceManager() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public List<Device> getAllDevices() {
        return devices;
    }

    public Device findDeviceById(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                return device;
            }
        }
        return null;
    }
}
