package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: ResidentMapper
 */

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.example.database_backend.database.entity.ResidentEntity;

import java.util.List;

@Mapper
public interface ResidentMapper {

    // insert resident
    @Insert("insert into resident(id, age, gender, name, residence, number) values(#{residentId}, #{residentAge}, #{residentGender}, #{residentName}, #{residentResidence}, #{residentNumber})")
    public void insertResident(Integer residentId, Integer residentAge, String residentGender, String residentName, String residentResidence, String residentNumber);

    // delete resident by id
    @Delete("delete from resident where id = #{residentId}")
    public void deleteResidentById(Integer residentId);

    // select resident by id
    @Select("select * from resident where id = #{residentId}")
    public List<ResidentEntity> selectResidentById(Integer residentId);

    // select resident by name
    @Select("select * from resident where name = #{residentName}")
    public List<ResidentEntity> selectResidentByName(String residentName);
}
