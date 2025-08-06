package com.example.oa.controller;

import util.ELResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.oa.entity.GovEmployee;
import com.example.oa.service.IGovEmployeeService;
import jakarta.el.ELResolver;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * <p>
 * 公务员信息表 前端控制器
 * </p>
 *
 * @author LYY
 * @since 2025-08-04
 */
@RestController
@RequestMapping("/govEmployee")
@CrossOrigin
public class GovEmployeeController {
    private final IGovEmployeeService employeeService;

    // 推荐使用构造器注入
    public GovEmployeeController(IGovEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
//
//    @GetMapping("/{id}")
//    public GovEmployee getById(@PathVariable String id) {
//        return employeeService.getById(id);
//    }


    @PostMapping("/login")  // 更规范的路径和方法
    public ELResult<GovEmployee> login(GovEmployee govEmployee) {
        // 1. 参数校验
        if (govEmployee == null || StringUtils.isEmpty(govEmployee.getPassword())) {
            return ELResult.error("参数不能为空");
        }

        // 2. 密码加密（改用更安全的算法）
        String encryptedPwd = DigestUtils.md5DigestAsHex(govEmployee.getPassword().getBytes(StandardCharsets.UTF_8));
        govEmployee.setPassword(encryptedPwd);

        // 3. 查询数据库
        QueryWrapper<GovEmployee> qw = new QueryWrapper<>(govEmployee);
        List<GovEmployee> users = employeeService.list(qw);  // 方法名小写

        // 4. 返回结果
        return users.isEmpty()
                ? ELResult.error("用户名或密码错误")
                : ELResult.ok(0L, users);  // 返回第一个匹配用户
    }
}



