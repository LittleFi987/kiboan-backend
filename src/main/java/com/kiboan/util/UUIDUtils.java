package com.kiboan.util;

import java.util.UUID;

/**
 * @author chenhao.ye
 * @date 2020-10-09
 */
public class UUIDUtils {

    public static String get() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
