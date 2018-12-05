package com.mifan.guessing.controller.request;

public class BaseRequest {

    private String userCode;//用户编码

    private String clinetIp;//用户ip

    private String deviceCode;//设备编码

    private String deviceType;//设备类型

    private String version;//应用编码

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getClinetIp() {
        return clinetIp;
    }

    public void setClinetIp(String clinetIp) {
        this.clinetIp = clinetIp;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
