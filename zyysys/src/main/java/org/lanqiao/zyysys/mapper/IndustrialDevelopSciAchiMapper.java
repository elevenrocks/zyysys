package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.IndustrialDevelopSciAchi;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopSciAchi
 */
public interface IndustrialDevelopSciAchiMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSciAchi record);

    int insertSelective(IndustrialDevelopSciAchi record);

    IndustrialDevelopSciAchi selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSciAchi record);

    int updateByPrimaryKey(IndustrialDevelopSciAchi record);

}
