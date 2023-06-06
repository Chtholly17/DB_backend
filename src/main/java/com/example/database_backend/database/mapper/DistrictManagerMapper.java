package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: DistrictManagerMapper
 */

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DistrictManagerMapper {
    // interface for district manager
    @Insert("insert into districtmanager(id, district, resident_id) values(#{districtManagerId}, #{districtManagerDistrict}, #{districtManagerResidentId})")
    public void insertDistrictManager(Integer districtManagerId, String districtManagerDistrict, Integer districtManagerResidentId);
}
