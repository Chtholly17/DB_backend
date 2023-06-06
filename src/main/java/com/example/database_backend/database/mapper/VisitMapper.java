package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: VisitMapper
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import com.example.database_backend.database.entity.VisitEntity;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface VisitMapper {
    // create a visit
    @Insert("insert into visit(id, respondent, visitor, state, processor) values (#{visitId}, #{visitRespondent}, #{visitVisitor}, #{visitState}, #{visitProcessor})")
    public void insertVisit(Integer visitId, Integer visitRespondent, Integer visitVisitor, String visitState, Integer visitProcessor);

    // select all visit by respondent
    @Select("select * from visit where respondent = #{visitRespondent}")
    public List<VisitEntity> selectVisitByRespondent(Integer visitRespondent);

    // update visit state
    @Update("update visit set state = #{visitState} where id = #{visitId}")
    public void updateVisitState(Integer visitId, String visitState);
}
