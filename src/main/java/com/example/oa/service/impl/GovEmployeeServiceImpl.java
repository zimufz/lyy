package com.example.oa.service.impl;

import com.example.oa.entity.GovEmployee;
import com.example.oa.mapper.GovEmployeeMapper;
import com.example.oa.service.IGovEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公务员信息表 服务实现类
 * </p>
 *
 * @author LYY
 * @since 2025-08-04
 */
@Service
public class GovEmployeeServiceImpl
        extends ServiceImpl<GovEmployeeMapper, GovEmployee>
        implements IGovEmployeeService {  // 修正拼写错误

    @Override
    public GovEmployee getById(String employeeId) {
        // 添加政府OA特有的逻辑（如密级校验）
        return baseMapper.selectByEmployeeId(employeeId);
    }
}


