package com.example.mybatisplusspringbootcacheexample.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author bruce ge 2023/3/16
*/

/**
    * 管理员表
    */
public class AdminCO implements Serializable {
    private Integer adminId;

    private String adminName;

    private Integer status;

    /**
    * 管理员密码
    */
    private String adminPwd;

    private String realName;

    private String telephone;

    /**
    * 添加时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    private Integer centerId;

    private Integer adminType;

    private Date mydate;

    private Integer adminlongcolumnismyxxxxxxxxxxxxx;

    private Integer cccccccc;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public Date getMydate() {
        return mydate;
    }

    public void setMydate(Date mydate) {
        this.mydate = mydate;
    }

    public Integer getAdminlongcolumnismyxxxxxxxxxxxxx() {
        return adminlongcolumnismyxxxxxxxxxxxxx;
    }

    public void setAdminlongcolumnismyxxxxxxxxxxxxx(Integer adminlongcolumnismyxxxxxxxxxxxxx) {
        this.adminlongcolumnismyxxxxxxxxxxxxx = adminlongcolumnismyxxxxxxxxxxxxx;
    }

    public Integer getCccccccc() {
        return cccccccc;
    }

    public void setCccccccc(Integer cccccccc) {
        this.cccccccc = cccccccc;
    }
}
