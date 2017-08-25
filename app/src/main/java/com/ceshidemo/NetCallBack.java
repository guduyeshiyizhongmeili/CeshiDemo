package com.ceshidemo;

/**
 * Created by 嘿 on 2017/8/24.
 */

public interface NetCallBack<T> {

    void successNet(T t);

    void errorNet(String errorMsg, int errorCode);
}
