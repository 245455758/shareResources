package com.trouble.shareresources.pojo;

import java.util.Date;

public class NewsSummary {
    private Integer id;

    private String title;

    private String pic;

    private Date publishDate;

    private Integer status;

    private String absContent;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAbsContent() {
        return absContent;
    }

    public void setAbsContent(String absContent) {
        this.absContent = absContent == null ? null : absContent.trim();
    }
}