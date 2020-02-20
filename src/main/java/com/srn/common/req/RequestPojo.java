package com.srn.common.req;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.stereotype.Component;

@JsonSerialize
@Component
public class RequestPojo {

    private String LoginRequestType;
    private String userName;
    private String pass;
    private long loginActivityId;
    private String attempTime;
    private String loginIp;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public long getLoginActivityId() {
        return loginActivityId;
    }

    public void setLoginActivityId(long loginActivityId) {
        this.loginActivityId = loginActivityId;
    }

    public String getAttempTime() {
        return attempTime;
    }

    public void setAttempTime(String attempTime) {
        this.attempTime = attempTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginRequestType() {
        return LoginRequestType;
    }

    public void setLoginRequestType(String loginRequestType) {
        LoginRequestType = loginRequestType;
    }
}
