package com.rxjavatest.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by liyan on 2017/3/2.
 */

public class Result {
    private int flag;
    private JSONArray params;
    private int errCode;
    private String cause;

    public JSONArray getParams() {
        return params;
    }

    public Result addParams(Object param){
        if (params!=null){
            params=new JSONArray();
        }
        params.add(param);
        return this;
    }

    public Result setParams(JSONArray params) {
        this.params = params;
        return this;
    }

    public int getFlag() {
        return flag;
    }

    public Result setFlag(int flag) {
        this.flag = flag;
        return this;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
