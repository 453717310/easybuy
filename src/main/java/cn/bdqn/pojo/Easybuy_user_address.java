package cn.bdqn.pojo;

import com.sun.jndi.cosnaming.IiopUrl;

import java.util.Date;

/**
 * Created by dll on 2017/8/17.
 */
public class Easybuy_user_address {
    private Integer id;//地址主键
    private Integer userId;//用户主键id
    private String address;//用户地址
    private Date createTime;//创建时间
    private Integer isDefault;//是否是默认地址（1:是 0否）
    private String remark;//备注

    public Easybuy_user_address() {
    }

    public Easybuy_user_address(Integer id, Integer userId, String address, Date createTime, Integer isDefault, String remark) {
        this.id = id;
        this.userId = userId;
        this.address = address;
        this.createTime = createTime;
        this.isDefault = isDefault;
        this.remark = remark;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Easybuy_user_address{" +
                "id=" + id +
                ", userId=" + userId +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", isDefault=" + isDefault +
                ", remark='" + remark + '\'' +
                '}';
    }
}
