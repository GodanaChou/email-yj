package edu.cqgcxy.mapper;

import edu.cqgcxy.model.SendEmail;
import edu.cqgcxy.model.SendEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SendEmailMapper {
    long countByExample(SendEmailExample example);

    int deleteByExample(SendEmailExample example);

    int deleteByPrimaryKey(Integer sendemailid);

    int insert(SendEmail record);

    int insertSelective(SendEmail record);

    List<SendEmail> selectByExample(SendEmailExample example);

    SendEmail selectByPrimaryKey(Integer sendemailid);

    int updateByExampleSelective(@Param("record") SendEmail record, @Param("example") SendEmailExample example);

    int updateByExample(@Param("record") SendEmail record, @Param("example") SendEmailExample example);

    int updateByPrimaryKeySelective(SendEmail record);

    int updateByPrimaryKey(SendEmail record);
}