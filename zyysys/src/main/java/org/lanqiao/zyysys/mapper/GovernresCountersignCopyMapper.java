package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.GovernresCountersignCopy;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresCountersignCopy
 */
public interface GovernresCountersignCopyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresCountersignCopy record);

    int insertSelective(GovernresCountersignCopy record);

    GovernresCountersignCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresCountersignCopy record);

    int updateByPrimaryKey(GovernresCountersignCopy record);

}
