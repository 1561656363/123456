package com.ysq.wifisignin.bean;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public class ResponseModel<M> implements Serializable {
    // 成功
    public static final int SUCCEED = 1;
    // 未知错误
    public static final int ERROR = 0;

    // 没有找到用户信息
    public static final int ERROR_NOT_FOUND_USER = 4041;
    // 没有找到群信息
    public static final int ERROR_NOT_FOUND_GROUP = 4042;
    // 没有找到群成员信息
    public static final int ERROR_NOT_FOUND_GROUP_MEMBER = 4043;
    // 没有找到发起签到的信息
    public static final int ERROR_NOT_FOUND_INITIATE = 4044;

    // 创建用户失败
    public static final int ERROR_CREATE_USER = 3001;
    // 创建群失败
    public static final int ERROR_CREATE_GROUP = 3002;
    // 创建群成员失败
    public static final int ERROR_CREATE_MESSAGE = 3003;

    // 请求参数错误
    public static final int ERROR_PARAMETERS = 4001;
    // 请求参数错误-已存在账户
    public static final int ERROR_PARAMETERS_EXIST_ACCOUNT = 4002;
    // 请求参数错误-已存在名称
    public static final int ERROR_PARAMETERS_EXIST_NAME = 4003;

    // 服务器错误
    public static final int ERROR_SERVICE = 5001;

    // 账户Token错误，需要重新登录
    public static final int ERROR_ACCOUNT_TOKEN = 2001;
    // 账户登录失败
    public static final int ERROR_ACCOUNT_LOGIN = 2002;
    // 账户注册失败
    public static final int ERROR_ACCOUNT_REGISTER = 2003;
    // 没有权限操作
    public static final int ERROR_ACCOUNT_NO_PERMISSION = 2010;

    // 修改用户信息失败
    public static final int ERROR_USER_UPDATE = 7001;

    // 签到相关
    // 与发起人不在同一个wifi下，mac地址不同，导致签到失败
    public static final int FAIL_ATTEND_WIFI_DIFFERENT = 7001;
    public static final int FAIL_ATTEND_HAVE_ATTENDED = 7002;

    private int code;
    private String message;
    private Date time;
    private M result;

    public boolean isSucceed() {
        return code == SUCCEED;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public M getResult() {
        return result;
    }

    public void setResult(M result) {
        this.result = result;
    }
}