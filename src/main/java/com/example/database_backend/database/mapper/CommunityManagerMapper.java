package com.example.database_backend.database.mapper;


/**
 * @auther: chtholly
 * @description: CommunityManagerMapper
 */


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
@Mapper
public interface CommunityManagerMapper {
    // insert a community manager
    @Insert("insert into communitymanager(id, community, resident_id) values (#{communityManagerId}, #{communityManagerCommunity}, #{communityManagerResidentId})")
    public void insertCommunityManager(Integer communityManagerId, String communityManagerCommunity, Integer communityManagerResidentId);
}
