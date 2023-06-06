package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: BuildingMapper
 */

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuildingMapper {
    // insert a building
    @Insert("insert into building(id, number, unit, community) values(#{buildingId}, #{buildingNumber}, #{buildingUnit}, #{buildingCommunity})")
    public void insertBuilding(Integer buildingId, String buildingNumber, String buildingUnit, String buildingCommunity);
}
