package cn.asae.saas.depotV2.dao;

import cn.asae.saas.depotV2.entity.WmsDepotstockNormal;

public interface WmsDepotstockNormalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsDepotstockNormal record);

    int insertSelective(WmsDepotstockNormal record);

    WmsDepotstockNormal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsDepotstockNormal record);

    int updateByPrimaryKey(WmsDepotstockNormal record);
}