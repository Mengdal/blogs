package com.mdh.service;

import com.mdh.po.Comment;

import java.util.List;

/**
 * Created by mdh on 2019/10/22.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
