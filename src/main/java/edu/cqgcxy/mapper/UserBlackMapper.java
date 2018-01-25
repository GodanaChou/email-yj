package edu.cqgcxy.mapper;

import edu.cqgcxy.model.UserBlack;
import edu.cqgcxy.model.UserBlackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBlackMapper {
    long countByExample(UserBlackExample example);

    int deleteByExample(UserBlackExample example);

    int deleteByPrimaryKey(Integer userblackid);

    int insert(UserBlack record);

    int insertSelective(UserBlack record);

    List<UserBlack> selectByExample(UserBlackExample example);

    UserBlack selectByPrimaryKey(Integer userblackid);

    int updateByExampleSelective(@Param("record") UserBlack record, @Param("example") UserBlackExample example);

    int updateByExample(@Param("record") UserBlack record, @Param("example") UserBlackExample example);

    int updateByPrimaryKeySelective(UserBlack record);

    int updateByPrimaryKey(UserBlack record);
}