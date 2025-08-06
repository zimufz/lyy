package com.example.oa.service;

import com.example.oa.entity.GovDepartment;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.xml.transform.Result;

/**
 * <p>
 * 政府部门表 服务类
 * </p>
 *
 * @author LYY
 * @since 2025-08-04
 */
public interface IGovDepartmentService extends IService<GovDepartment> {
    /**
     * 获取部门详情（根据当前登录用户所属部门）
     */
    Result<GovDepartment> getDepartmentInfo();
}
