package com.example.database_backend.database.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @auther: chtholly
 * @description: StreetMapper
 */
@Mapper
public interface StreetMapper {
    // insert a street
    @Insert("insert into street(id, name, district) values(#{streetId}, #{streetName}, #{streetDistrict})")
    public void insertStreet(Integer streetId, String streetName, String streetDistrict);
}
