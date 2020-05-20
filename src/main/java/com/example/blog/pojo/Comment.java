package com.example.blog.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author YZY
 * @date 2020/5/15 - 10:01
 */
public class Comment {

    private Long id;
//    评论的自关联  ，回复评论
    private List<Comment> reply;

    private String nickname;
//    创建时间
    private Date createTime;
//    内容
    private String content;
//    头像
    private String avatar;

    private Long blogId;

    private Long parentId;


    public Comment() {
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Comment(Long id, List<Comment> reply, String nickname, Date createTime, String content, String avatar, Long blogId, Long parentId) {
        this.id = id;
        this.reply = reply;
        this.nickname = nickname;
        this.createTime = createTime;
        this.content = content;
        this.avatar = avatar;
        this.blogId = blogId;
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", reply=" + reply +
                ", nickname='" + nickname + '\'' +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", blog=" + blogId +
                ", parentId=" + parentId +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Comment> getReply() {
        return reply;
    }

    public void setReply(List<Comment> reply) {
        this.reply = reply;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }



    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
