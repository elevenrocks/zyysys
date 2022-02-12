package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.IndustrialDevelopExpertRef;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopExpertRef
 */
public interface IndustrialDevelopExpertRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopExpertRef record);

    int insertSelective(IndustrialDevelopExpertRef record);

    IndustrialDevelopExpertRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopExpertRef record);

    int updateByPrimaryKey(IndustrialDevelopExpertRef record);

}
