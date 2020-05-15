package com.example.blog.pojo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 9:27
 */

public class Blog {

    private Long id;
    private String title;
//    内容
    private String content;
//    首图
    private String firstPicture;
//    标记
    private String flag;
    private Date createTime;
    private Date updateTime;
    private Integer views;
    private boolean apperciation;
    private boolean shareStatement;
    private boolean pblished;
    private boolean  recommend;

    public Blog(Long id, String title, String content, String firstPicture, String flag, Date createTime, Date updateTime, Integer views, boolean apperciation, boolean shareStatement, boolean pblished, boolean recommend, List<Tag> tags, List<Comment> comments, Type type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.firstPicture = firstPicture;
        this.flag = flag;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.views = views;
        this.apperciation = apperciation;
        this.shareStatement = shareStatement;
        this.pblished = pblished;
        this.recommend = recommend;
        Tags = tags;
        Comments = comments;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public boolean isApperciation() {
        return apperciation;
    }

    public void setApperciation(boolean apperciation) {
        this.apperciation = apperciation;
    }

    public boolean isShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    public boolean isPblished() {
        return pblished;
    }

    public void setPblished(boolean pblished) {
        this.pblished = pblished;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public List<Tag> getTags() {
        return Tags;
    }

    public void setTags(List<Tag> tags) {
        Tags = tags;
    }

    public List<Comment> getComments() {
        return Comments;
    }

    public void setComments(List<Comment> comments) {
        Comments = comments;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", views=" + views +
                ", apperciation=" + apperciation +
                ", shareStatement=" + shareStatement +
                ", pblished=" + pblished +
                ", recommend=" + recommend +
                ", Tags=" + Tags +
                ", Comments=" + Comments +
                ", type=" + type +
                '}';
    }

    private List<Tag> Tags;

    private List<Comment> Comments;

    private Type type;

    public Blog() {
    }

}
