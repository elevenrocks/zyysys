package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.GovernresAdviceCopy;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresAdviceCopy
 */
public interface GovernresAdviceCopyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresAdviceCopy record);

    int insertSelective(GovernresAdviceCopy record);

    GovernresAdviceCopy selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresAdviceCopy record);

    int updateByPrimaryKey(GovernresAdviceCopy record);

}
