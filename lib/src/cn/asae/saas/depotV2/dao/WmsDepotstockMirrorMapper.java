package cn.asae.saas.depotV2.dao;

import cn.asae.saas.depotV2.entity.WmsDepotstockMirror;

public interface WmsDepotstockMirrorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsDepotstockMirror record);

    int insertSelective(WmsDepotstockMirror record);

    WmsDepotstockMirror selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsDepotstockMirror record);

    int updateByPrimaryKey(WmsDepotstockMirror record);
}