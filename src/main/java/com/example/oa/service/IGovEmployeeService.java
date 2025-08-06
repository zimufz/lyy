package com.example.oa.service;

import com.example.oa.entity.GovEmployee;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 公务员信息表 服务类
 * </p>
 *
 * @author LYY
 * @since 2025-08-04
 */
public interface IGovEmployeeService extends IService<GovEmployee> {
    GovEmployee getById(String employeeId);
}
