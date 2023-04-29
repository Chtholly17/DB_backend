package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: PublicMapper
 */

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublicMapper {
    // insert a public
    @Insert("insert into public(id, name, type, number, street, introduction) values(#{publicId}, #{publicName}, #{publicType}, #{publicNumber}, #{publicStreet}, #{publicIntroduction})")
    public void insertPublic(Integer publicId, String publicName, String publicType, String publicNumber, String publicStreet, String publicIntroduction);


}
