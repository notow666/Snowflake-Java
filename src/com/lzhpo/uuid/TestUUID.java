package com.lzhpo.uuid;

import java.util.UUID;

/**
 * <p> Author：lzhpo </p>
 * <p> Title：</p>
 * <p> Description：
 * UUID的生成策略：
 * 看UUID的源码知道一共有四种生成策略：
 *       UUID有四种不同的基本类型：基于时间，DCE安全性，基于名称和随机生成的UUID。这些类型的版本值分别为1,2,3和4。
 * randomly: 基于随机数生成UUID，由于Java中的随机数是伪随机数，其重复的概率是可以被计算出来的。
 * </p>
 */
public class TestUUID {
    public static void main(String[] args) {
        /**
         * randomUUID
         */
        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid.toString());
        for (int i = 0; i < (1 << 10); i++) {
            System.out.println(uuid.toString());
        }
    }
}
