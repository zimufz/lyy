package util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;


//代码生成工具类
public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/oa?serverTimezone=Asia/Shanghai", "root", "114514")
                .globalConfig(builder -> builder
                                .author("LYY")
//                        项目坐在目录地址（抄项目名后面显示的地址）
                                .outputDir("E:/shixiwenjian/OA/src/main/java")
                )
                .packageConfig(builder -> builder
                        .parent("com.example.oa")
                )
                .strategyConfig(builder -> {
                    builder.addInclude("gov_employee"); // 设置需要生成的表名
                })
                .execute();
    }
}
