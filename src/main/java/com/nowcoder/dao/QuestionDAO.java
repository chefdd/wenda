package com.nowcoder.dao;

import com.nowcoder.model.Question;
import com.nowcoder.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by chenxuqaing
 */
@Mapper
public interface QuestionDAO {
    String TABLE_NAME = " question ";
    String INSERT_FIELDS = " title, content, created_date, user_id, comment_count ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    /**
     *  添加问题
     * @param question
     * @return
     */
    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{title},#{content},#{createdDate},#{userId},#{commentCount})"})
    int addQuestion(Question question);

    /**
     * 查询最新的问题，并进行分页
     * @param userId
     * @param offset
     * @param limit
     * @return
     */
    List<Question> selectLatestQuestions(@Param("userId") int userId, @Param("offset") int offset,
                                         @Param("limit") int limit);

}
