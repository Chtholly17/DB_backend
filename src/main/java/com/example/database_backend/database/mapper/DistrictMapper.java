package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: DistrictMapper
 */

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DistrictMapper {
    // insert a district
    @Insert("insert into district(id, name) values(#{districtId}, #{districtName})")
    public void insertDistrict(Integer districtId, String districtName);
}
