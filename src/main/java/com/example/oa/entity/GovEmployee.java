package com.example.oa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 公务员信息表
 * </p>
 *
 * @author LYY
 * @since 2025-08-04
 */
@TableName("gov_employee")
public class GovEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 身份证号
     */
    @TableId("employee_id")
    private String employeeId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 职务
     */
    private String position;

    /**
     * 职级
     */
    @TableField(value = "`rank`")
    private String rank;

    /**
     * 所属部门
     */
    private String deptId;

    /**
     * 联系电话
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 密级权限
     */
    private Byte secretLevel;

    /**
     * 状态(1在职2离职)
     */
    private Byte status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(Byte secretLevel) {
        this.secretLevel = secretLevel;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "GovEmployee{" +
            "employeeId = " + employeeId +
            ", name = " + name +
            ", gender = " + gender +
            ", position = " + position +
            ", rank = " + rank +
            ", deptId = " + deptId +
            ", mobile = " + mobile +
            ", email = " + email +
            ", secretLevel = " + secretLevel +
            ", status = " + status +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            "}";
    }
}
