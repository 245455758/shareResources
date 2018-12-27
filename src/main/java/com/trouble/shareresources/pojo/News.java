package com.trouble.shareresources.pojo;

import java.util.Date;

public class News {
    private Integer id;

    private String title;

    private String publisher;

    private Date time;

    private Integer isrecommend;

    private Integer readtimes;

    private String catelogue;

    private Integer status;

    private String pic;

    private String summaryContent;

    private Date checkTime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Integer isrecommend) {
        this.isrecommend = isrecommend;
    }

    public Integer getReadtimes() {
        return readtimes;
    }

    public void setReadtimes(Integer readtimes) {
        this.readtimes = readtimes;
    }

    public String getCatelogue() {
        return catelogue;
    }

    public void setCatelogue(String catelogue) {
        this.catelogue = catelogue == null ? null : catelogue.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getSummaryContent() {
        return summaryContent;
    }

    public void setSummaryContent(String summaryContent) {
        this.summaryContent = summaryContent == null ? null : summaryContent.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

//    News news = new News(title,publisher,new Date(),0,0,"新闻",0,pic,content);


    public News() {
    }

    public News(String title, String publisher, Date time, Integer isrecommend, Integer readtimes, String catelogue, Integer status, String pic, String summaryContent, String content) {
        this.title = title;
        this.publisher = publisher;
        this.time = time;
        this.isrecommend = isrecommend;
        this.readtimes = readtimes;
        this.catelogue = catelogue;
        this.status = status;
        this.pic = pic;
        this.summaryContent = summaryContent;
        this.content = content;
    }

    public News(Integer id, String title, String publisher, Date time, Integer isrecommend, Integer readtimes, String catelogue, Integer status, String pic, String summaryContent, Date checkTime, String content) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.time = time;
        this.isrecommend = isrecommend;
        this.readtimes = readtimes;
        this.catelogue = catelogue;
        this.status = status;
        this.pic = pic;
        this.summaryContent = summaryContent;
        this.checkTime = checkTime;
        this.content = content;
    }
}