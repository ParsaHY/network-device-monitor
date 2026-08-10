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
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i).getId() == id) {
                return devices.get(i);
            }
        }
        return null;
    }
}
