package com.parsa.networkmonitor;

import java.io.IOException;
import java.net.InetAddress;

public class NetworkChecker {
    public DeviceStatus checkStatus(Device device) {
        String ipAddress = device.getIpAddress();
        try {
            if (InetAddress.getByName(ipAddress).isReachable(2000)) {
                device.setStatus(DeviceStatus.UP);
                return DeviceStatus.UP;
            }
            device.setStatus(DeviceStatus.DOWN);
            return DeviceStatus.DOWN;

        } catch (IOException e) {
            device.setStatus(DeviceStatus.DOWN);
            return DeviceStatus.DOWN;
        }
    }
}
