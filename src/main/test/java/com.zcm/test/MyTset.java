package com.zcm.test;

import com.zcm.utils.MD5Util;
import org.junit.Test;

public class MyTset {
    @Test
    public void testMD5(){
        String mi = MD5Util.getMD5("000000");
        System.out.println(mi);
    }
}
