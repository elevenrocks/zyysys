package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.IndustrialDevelopCooExc;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopCooExc
 */
public interface IndustrialDevelopCooExcMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopCooExc record);

    int insertSelective(IndustrialDevelopCooExc record);

    IndustrialDevelopCooExc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopCooExc record);

    int updateByPrimaryKey(IndustrialDevelopCooExc record);

}
