package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.IndustrialDevelopSaleDrug;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopSaleDrug
 */
public interface IndustrialDevelopSaleDrugMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopSaleDrug record);

    int insertSelective(IndustrialDevelopSaleDrug record);

    IndustrialDevelopSaleDrug selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopSaleDrug record);

    int updateByPrimaryKey(IndustrialDevelopSaleDrug record);

}
