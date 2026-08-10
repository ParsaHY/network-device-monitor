package com.parsa.networkmonitor;

public class Device {
    private int id;
    private String name;
    private String ipAddress;
    private DeviceStatus status;

    public Device(int id, String name, String ipAddress) {
        this.id = id;
        this.name = name;
        this.ipAddress = ipAddress;
        this.status = DeviceStatus.UNKNOWN;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public DeviceStatus getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "Device{id=" + this.id + ", name='" + this.name + "', ipAddress='" + this.ipAddress + "', status=" + this.status;
    }
}
