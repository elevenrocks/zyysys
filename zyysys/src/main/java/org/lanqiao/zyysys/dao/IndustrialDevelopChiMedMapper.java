package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.IndustrialDevelopChiMed;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopChiMed
 */
public interface IndustrialDevelopChiMedMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopChiMed record);

    int insertSelective(IndustrialDevelopChiMed record);

    IndustrialDevelopChiMed selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopChiMed record);

    int updateByPrimaryKey(IndustrialDevelopChiMed record);

}
