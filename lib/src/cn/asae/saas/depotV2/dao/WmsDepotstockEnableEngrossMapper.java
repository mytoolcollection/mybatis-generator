package cn.asae.saas.depotV2.dao;

import cn.asae.saas.depotV2.entity.WmsDepotstockEnableEngross;

public interface WmsDepotstockEnableEngrossMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsDepotstockEnableEngross record);

    int insertSelective(WmsDepotstockEnableEngross record);

    WmsDepotstockEnableEngross selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsDepotstockEnableEngross record);

    int updateByPrimaryKey(WmsDepotstockEnableEngross record);
}