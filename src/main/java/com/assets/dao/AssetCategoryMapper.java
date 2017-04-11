package com.assets.dao;

import com.assets.entity.AssetCategory;

public interface AssetCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetCategory record);

    int insertSelective(AssetCategory record);

    AssetCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetCategory record);

    int updateByPrimaryKey(AssetCategory record);
}