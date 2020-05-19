package com.example.blog.pojo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 9:27
 */

public class Blog {

    private Long id;
//    内容
    private String content;
//    首图
    private Date createTime;
    private String firstPicture;
    private boolean pblished;
    private String title;
    private Date updateTime;
    private Integer views;
    private Long typeId;
    private List<Comment> Comments = new ArrayList<>();
    private Type type;
    private String author = "尹振宇";
    private String description;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Blog(Long id, String title, String content, String firstPicture, Date createTime, Date updateTime, Integer views, boolean pblished, Long typeId, List<Comment> comments, Type type,String description) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.firstPicture = firstPicture;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.views = views;
        this.pblished = pblished;
        this.typeId = typeId;
        Comments = comments;
        this.type = type;
        this.description =description;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPicture='" + firstPicture + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", views=" + views +
                ", pblished=" + pblished +
                ", typeId=" + typeId +
                ", Comments=" + Comments +
                ", type=" + type +
                ", description=" + description +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Blog() {

    }


    public Long getTagId() {
        return typeId;
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

    public boolean isPblished() {
        return pblished;
    }

    public void setPblished(boolean pblished) {
        this.pblished = pblished;
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

}
