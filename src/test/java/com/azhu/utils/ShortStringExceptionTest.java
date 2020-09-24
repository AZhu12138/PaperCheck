package com.azhu.utils;

import org.junit.Test;

public class ShortStringExceptionTest {

    @Test
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(SimHashUtils.getSimHash("一位正真的作家"));
    }

}
