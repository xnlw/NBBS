package com.jvmup.nbbs.dao;

import com.jvmup.nbbs.po.User;
import com.jvmup.nbbs.po.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * ProjectName: NBBS
 *
 * @author xxl
 * <p>
 * Created by xxl on - 2018-07-16 11:30
 **/
public interface CommentDao {
    /**
     * @author lhm
     * <p>
     *     通过id获取评论相关的非用户信息
     * </p>
     */
    Comment getCommentInfoExceptUserById(int id);
    /**
     * @author lhm
     * <p>
     *     通过评论id获取用户信息
     * </p>
     */
    User getUserIfoById(int id);
    /**
     * @author lhm
     * <p>
     *     通过评论id删除评论
     * </p>
     */
    void deleteCommentById(int id);
    /**
     * @author lhm
     * <p>
     *     通过post id获取该post下所有评论
     * </p>
     */
    List<Comment> getAllCommentByPostId(int post_id);
    /**
     * @author lhm
     * <p>
     *  添加一条评论
     * </p>
     */
    void addComment(Comment comment);
}
