package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.GovernresPost;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresPost
 */
public interface GovernresPostMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresPost record);

    int insertSelective(GovernresPost record);

    GovernresPost selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresPost record);

    int updateByPrimaryKey(GovernresPost record);

}
