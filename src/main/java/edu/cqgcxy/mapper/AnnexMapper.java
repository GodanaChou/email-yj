package edu.cqgcxy.mapper;

import edu.cqgcxy.model.Annex;
import edu.cqgcxy.model.AnnexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnexMapper {
    long countByExample(AnnexExample example);

    int deleteByExample(AnnexExample example);

    int deleteByPrimaryKey(Integer annexid);

    int insert(Annex record);

    int insertSelective(Annex record);

    List<Annex> selectByExample(AnnexExample example);

    Annex selectByPrimaryKey(Integer annexid);

    int updateByExampleSelective(@Param("record") Annex record, @Param("example") AnnexExample example);

    int updateByExample(@Param("record") Annex record, @Param("example") AnnexExample example);

    int updateByPrimaryKeySelective(Annex record);

    int updateByPrimaryKey(Annex record);
}