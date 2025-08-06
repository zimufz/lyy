package com.example.oa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.oa.entity.GovEmployee;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 公务员信息表 Mapper 接口
 * </p>
 *
 * @author LYY
 * @since 2025-08-04
 */
public interface GovEmployeeMapper extends BaseMapper<GovEmployee> {
    GovEmployee selectByEmployeeId(@Param("employeeId") String employeeId);
}
