package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.GovernresCountersign;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresCountersign
 */
public interface GovernresCountersignMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresCountersign record);

    int insertSelective(GovernresCountersign record);

    GovernresCountersign selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresCountersign record);

    int updateByPrimaryKey(GovernresCountersign record);

}
