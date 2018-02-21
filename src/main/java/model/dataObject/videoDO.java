package model.dataObject;

import model.BaseObject;

import java.util.Date;

public class videoDO extends BaseObject {

    /**
     * 电影名称
     */
    private String vodeoName;

    /**
     * 电影ID
     */
    private String videoId;

    /**
     * 电影类型
     */
    private String videoType;

    /**
     * 电影地区
     */
    private String videoLocation;

    /**
     * 电影得分(0~10的浮点数)
     */
    private double videoScore;

    /**
     * 电影能够观看级别(需大于等于此级别才可观看)
     */
    private int videoLevel;

    /**
     * 导演(以逗号分隔)
     */
    private String director;

    /**
     * 导演(以逗号分隔)
     */
    private String actor;

    /**
     * 影片状态
     */
    private String videoStatus;

    /**
     * 最近修改时间
     */
    private Date gmtModified;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改人
     */
    private String modifier;

    public String getVodeoName() {
        return vodeoName;
    }

    public void setVodeoName(String vodeoName) {
        this.vodeoName = vodeoName;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoLocation() {
        return videoLocation;
    }

    public void setVideoLocation(String videoLocation) {
        this.videoLocation = videoLocation;
    }

    public double getVideoScore() {
        return videoScore;
    }

    public void setVideoScore(double videoScore) {
        this.videoScore = videoScore;
    }

    public int getVideoLevel() {
        return videoLevel;
    }

    public void setVideoLevel(int videoLevel) {
        this.videoLevel = videoLevel;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(String videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}
