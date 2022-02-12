package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.HealthCareSciKnow;

/**
 * @Entity org.lanqiao.zyysys.domain.HealthCareSciKnow
 */
public interface HealthCareSciKnowMapper {

    int deleteByPrimaryKey(Long id);

    int insert(HealthCareSciKnow record);

    int insertSelective(HealthCareSciKnow record);

    HealthCareSciKnow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthCareSciKnow record);

    int updateByPrimaryKey(HealthCareSciKnow record);

}