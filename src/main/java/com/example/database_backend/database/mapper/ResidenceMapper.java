package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: ResidenceMapper
 */

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.database_backend.database.entity.ResidenceEntity;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface ResidenceMapper {
    // insert a residence
    @Insert("insert into residence(id, waterFee, electricityFee, building, floor, number) values(#{residenceId}, #{residenceWaterFee}, #{residenceElectricityFee}, #{residenceBuilding}, #{residenceFloor}, #{residenceNumber})")
    public void insertResidence(Integer residenceId, Integer residenceWaterFee, Integer residenceElectricityFee, String residenceBuilding, String residenceFloor, String residenceNumber);

    // select residence by id
    @Select("select * from residence where id = #{residenceId}")
    public ResidenceEntity selectResidenceById(Integer residenceId);

    // update water fee by id
    @Update("update residence set waterFee = #{residenceWaterFee} where id = #{residenceId}")
    public void updateWaterFeeById(Integer residenceId, Integer residenceWaterFee);

    // update electricity fee by id
    @Update("update residence set electricityFee = #{residenceElectricityFee} where id = #{residenceId}")
    public void updateElectricityFeeById(Integer residenceId, Integer residenceElectricityFee);
}
