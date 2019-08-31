package com.lzhpo.snowflake;

/**
 * <p> Author：lzhpo </p>
 * <p> Title：测试雪花算法</p>
 * <p> Description：
 *
 * 测试结果：生成的ID都是递增的，而且都是唯一的。
 *
 * </p>
 */
public class AppRun {
    public static void main(String[] args) {
        SnowFlake snowFlake = new SnowFlake(2, 3);
        //循环生成2^10个ID（1024）
        for (int i = 0; i < (1 << 10); i++) {
            System.out.println(snowFlake.nextId());
        }
    }
}
