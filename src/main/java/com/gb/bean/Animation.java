package com.gb.bean;

public class Animation {
    private Integer aniId;

    private String aniName;

    private String aniDest;

    public Animation() {
    }

    public Animation(Integer aniId, String aniName, String aniDest) {
        this.aniId = aniId;
        this.aniName = aniName;
        this.aniDest = aniDest;
    }

    public Integer getAniId() {
        return aniId;
    }

    public void setAniId(Integer aniId) {
        this.aniId = aniId;
    }

    public String getAniName() {
        return aniName;
    }

    public void setAniName(String aniName) {
        this.aniName = aniName == null ? null : aniName.trim();
    }

    public String getAniDest() {
        return aniDest;
    }

    public void setAniDest(String aniDest) {
        this.aniDest = aniDest == null ? null : aniDest.trim();
    }
}