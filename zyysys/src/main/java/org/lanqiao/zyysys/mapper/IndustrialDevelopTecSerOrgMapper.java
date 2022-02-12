package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.IndustrialDevelopTecSerOrg;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopTecSerOrg
 */
public interface IndustrialDevelopTecSerOrgMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTecSerOrg record);

    int insertSelective(IndustrialDevelopTecSerOrg record);

    IndustrialDevelopTecSerOrg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTecSerOrg record);

    int updateByPrimaryKey(IndustrialDevelopTecSerOrg record);

}
