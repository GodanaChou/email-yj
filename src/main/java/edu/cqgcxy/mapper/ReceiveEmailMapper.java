package edu.cqgcxy.mapper;

import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.model.ReceiveEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiveEmailMapper {
    long countByExample(ReceiveEmailExample example);

    int deleteByExample(ReceiveEmailExample example);

    int deleteByPrimaryKey(Integer receiveemailid);

    int insert(ReceiveEmail record);

    int insertSelective(ReceiveEmail record);

    List<ReceiveEmail> selectByExample(ReceiveEmailExample example);

    ReceiveEmail selectByPrimaryKey(Integer receiveemailid);

    int updateByExampleSelective(@Param("record") ReceiveEmail record, @Param("example") ReceiveEmailExample example);

    int updateByExample(@Param("record") ReceiveEmail record, @Param("example") ReceiveEmailExample example);

    int updateByPrimaryKeySelective(ReceiveEmail record);

    int updateByPrimaryKey(ReceiveEmail record);
}