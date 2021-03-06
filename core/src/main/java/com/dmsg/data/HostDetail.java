package com.dmsg.data;

import com.dmsg.message.vo.SourceAddress;

/**
 * Created by cjl on 2016/7/28.
 */
public class HostDetail{
    private String ip;
    private int port;
    private long lastTime;
    private long hostId;
    private long userSize;
    private long msgSize;

    public HostDetail(SourceAddress sourceAddress) {
        this.ip = sourceAddress.getHost();
        this.port = sourceAddress.getPort();
        this.lastTime = System.currentTimeMillis();
    }

    public HostDetail() {

    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getLastTime() {
        return lastTime;
    }

    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }

    public long getHostId() {
        return hostId;
    }

    public void setHostId(long hostId) {
        this.hostId = hostId;
    }

    public long getUserSize() {
        return userSize;
    }

    public void setUserSize(long userSize) {
        this.userSize = userSize;
    }

    public long getMsgSize() {
        return msgSize;
    }

    public void setMsgSize(long msgSize) {
        this.msgSize = msgSize;
    }

    public String keyFiled() {
        return this.getIp() + ":" + this.getPort();
    }


    @Override
    public String toString() {
        return "HostDetail{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", lastTime=" + lastTime +
                ", hostId=" + hostId +
                ", userSize=" + userSize +
                ", msgSize=" + msgSize +
                '}';
    }
}
