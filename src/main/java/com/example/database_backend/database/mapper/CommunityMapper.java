package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: CommunityMapper
 */

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CommunityMapper {
    // insert a community
    @Insert("insert into community(id, name, area, street) values(#{communityId}, #{communityName}, #{communityArea}, #{communityStreet})")
    public void insertCommunity(Integer communityId, String communityName, String communityArea, String communityStreet);
}
