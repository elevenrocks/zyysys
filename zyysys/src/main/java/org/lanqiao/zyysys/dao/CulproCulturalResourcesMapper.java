package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.CulproCulturalResources;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproCulturalResources
 */
public interface CulproCulturalResourcesMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproCulturalResources record);

    int insertSelective(CulproCulturalResources record);

    CulproCulturalResources selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproCulturalResources record);

    int updateByPrimaryKey(CulproCulturalResources record);

}
