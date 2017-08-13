package com.nowcoder.model;

import java.util.Date;

/**
 * Created by chenxueqiang.
 */
public class Question {
    //问题id
    private int id;
    //问题标题
    private String title;
    //问题内容
    private String content;
    //发表时间
    private Date createdDate;
    //发表问题的用户
    private int userId;
    //评论数量
    private int commentCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
