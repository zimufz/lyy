package com.example.oa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 政府部门表
 * </p>
 *
 * @author LYY
 * @since 2025-08-04
 */
@TableName("gov_department")
public class GovDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门统一社会信用代码
     */
    @TableId("dept_id")
    private String deptId;

    /**
     * 部门全称
     */
    private String deptName;

    /**
     * 部门简称
     */
    private String shortName;

    /**
     * 上级部门代码
     */
    private String parentId;

    /**
     * 行政级别(1-5对应国省市县乡)
     */
    private Byte deptLevel;

    /**
     * 部门类型
     */
    private String deptType;

    /**
     * 密级(1公开2内部3秘密4机密)
     */
    private Byte secretLevel;

    /**
     * 排序号
     */
    private Integer orderNum;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Byte getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(Byte deptLevel) {
        this.deptLevel = deptLevel;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public Byte getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(Byte secretLevel) {
        this.secretLevel = secretLevel;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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
        return "GovDepartment{" +
            "deptId = " + deptId +
            ", deptName = " + deptName +
            ", shortName = " + shortName +
            ", parentId = " + parentId +
            ", deptLevel = " + deptLevel +
            ", deptType = " + deptType +
            ", secretLevel = " + secretLevel +
            ", orderNum = " + orderNum +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
            "}";
    }
}
