package com.gb.bean;

import java.util.Date;

public class Characters {
    private Integer chId;

    private String chName;

    private String chBirthday;

    private String chBack;

    private String chAni;

    private String chImg;

    public Characters() {
    }

    public Characters(Integer chId, String chName, String chBirthday, String chBack, String chAni, String chImg) {
        this.chId = chId;
        this.chName = chName;
        this.chBirthday = chBirthday;
        this.chBack = chBack;
        this.chAni = chAni;
        this.chImg = chImg;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "chId=" + chId +
                ", chName='" + chName + '\'' +
                ", chBirthday='" + chBirthday + '\'' +
                ", chBack='" + chBack + '\'' +
                ", chAni='" + chAni + '\'' +
                ", chImg='" + chImg + '\'' +
                '}';
    }

    public Integer getChId() {
        return chId;
    }

    public void setChId(Integer chId) {
        this.chId = chId;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    public String getChBirthday() {
        return chBirthday;
    }

    public void setChBirthday(String chBirthday) {
        this.chBirthday = chBirthday;
    }

    public String getChBack() {
        return chBack;
    }

    public void setChBack(String chBack) {
        this.chBack = chBack == null ? null : chBack.trim();
    }

    public String getChAni() {
        return chAni;
    }

    public void setChAni(String chAni) {
        this.chAni = chAni == null ? null : chAni.trim();
    }

    public String getChImg() {
        return chImg;
    }

    public void setChImg(String chImg) {
        this.chImg = chImg == null ? null : chImg.trim();
    }
}