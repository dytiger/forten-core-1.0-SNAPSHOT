package org.forten.utils.security;

import org.junit.Test;

public class MD5UtilTest {
    @Test
    public void test(){
        String str = "websocket#6897";
        String enc = MD5Util.encrypt(str);
        System.out.println(enc);
    }
}
