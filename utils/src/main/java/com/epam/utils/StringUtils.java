package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isParsable(str)) {
            if (str.startsWith("0")) return false;
            BigDecimal number = new BigDecimal(str);
            return number.compareTo(BigDecimal.ZERO) > 0;
        }
        return false;
    }
}
