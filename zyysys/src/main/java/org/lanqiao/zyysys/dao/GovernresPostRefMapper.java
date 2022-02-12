package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.GovernresPostRef;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresPostRef
 */
public interface GovernresPostRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresPostRef record);

    int insertSelective(GovernresPostRef record);

    GovernresPostRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresPostRef record);

    int updateByPrimaryKey(GovernresPostRef record);

}
