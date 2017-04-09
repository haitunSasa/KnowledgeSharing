package com.rxjavatest.Base.baserx;


import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by liyan on 2017/3/3.
 */


public class RxBus {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    public  @interface Test{
        Integer id() ;

    }




}

