package com.example.database_backend.database.mapper;

/**
 * @auther: chtholly
 * @description: ShopMapper
 */

import com.example.database_backend.database.entity.ShopEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopMapper {
    // insert shop
    @Insert("insert into shop(id, name, type, number, street, introduction) values(#{shopId}, #{shopName}, #{shopType}, #{shopNumber}, #{shopStreet}, #{shopIntroduction})")
    public void insertShop(Integer shopId, String shopName, String shopType, String shopNumber, String shopStreet, String shopIntroduction);

    // select shop by id
    @Select("select * from shop where id = #{shopId}")
    public ShopEntity selectShopById(Integer shopId);

    // select shop by type
    @Select("select * from shop where type = #{shopType}")
    public List<ShopEntity> selectShopByType(String shopType);

    // select shop by name
    @Select("select * from shop where name = #{shopName}")
    public List<ShopEntity> selectShopByName(String shopName);

    // delete shop by id
    @Select("delete from shop where id = #{shopId}")
    public void deleteShopById(Integer shopId);

}
