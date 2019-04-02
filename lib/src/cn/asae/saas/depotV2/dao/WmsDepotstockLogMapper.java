package cn.asae.saas.depotV2.dao;

import cn.asae.saas.depotV2.entity.WmsDepotstockLog;

public interface WmsDepotstockLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsDepotstockLog record);

    int insertSelective(WmsDepotstockLog record);

    WmsDepotstockLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsDepotstockLog record);

    int updateByPrimaryKey(WmsDepotstockLog record);
}