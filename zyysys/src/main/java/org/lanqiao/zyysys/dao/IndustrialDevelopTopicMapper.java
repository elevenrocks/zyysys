package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.IndustrialDevelopTopic;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopTopic
 */
public interface IndustrialDevelopTopicMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTopic record);

    int insertSelective(IndustrialDevelopTopic record);

    IndustrialDevelopTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTopic record);

    int updateByPrimaryKey(IndustrialDevelopTopic record);

}
