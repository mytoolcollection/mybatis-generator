package cn.asae.saas.depotV2.dao;

import cn.asae.saas.depotV2.entity.WmsDepotstockEnable;

public interface WmsDepotstockEnableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsDepotstockEnable record);

    int insertSelective(WmsDepotstockEnable record);

    WmsDepotstockEnable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsDepotstockEnable record);

    int updateByPrimaryKey(WmsDepotstockEnable record);
}