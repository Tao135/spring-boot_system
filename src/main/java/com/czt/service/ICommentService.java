package com.czt.service;

import com.github.pagehelper.PageInfo;
import com.czt.model.domain.Comment;

public interface ICommentService {
    // 获取文章下的评论
    public PageInfo<Comment> getComments(Integer aid, int page, int count);

    // 用户发表评论
    public void pushComment(Comment comment);

}

