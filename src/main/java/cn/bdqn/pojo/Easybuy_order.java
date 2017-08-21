package cn.bdqn.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dll on 2017/8/16.
 * 订单类
 */
public class Easybuy_order implements Serializable {
    private Integer id;//订单id
    private Integer userId;//用户主键
    private String loginName;//登录名
    private String userAddress;//用户地址
    private Date createTime;//创建时间
    private Float cost;//总消费
    private String serialNumber;//订单编号

    public Easybuy_order(Integer id, Integer userId, String loginName, String userAddress, Date createTime, Float cost, String serialNumber) {
        this.id = id;
        this.userId = userId;
        this.loginName = loginName;
        this.userAddress = userAddress;
        this.createTime = createTime;
        this.cost = cost;
        this.serialNumber = serialNumber;
    }

    public Easybuy_order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Easybuy_order{" +
                "id=" + id +
                ", userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", createTime=" + createTime +
                ", cost=" + cost +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
