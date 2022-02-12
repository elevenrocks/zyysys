package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.GovernresAdvice;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresAdvice
 */
public interface GovernresAdviceMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresAdvice record);

    int insertSelective(GovernresAdvice record);

    GovernresAdvice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresAdvice record);

    int updateByPrimaryKey(GovernresAdvice record);

}
