package com.assets.dao;

import com.assets.entity.Asset;

public interface AssetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Asset record);

    int insertSelective(Asset record);

    Asset selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);
}