package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.ResourceRoleRef;

/**
 * @Entity org.lanqiao.zyysys.domain.ResourceRoleRef
 */
public interface ResourceRoleRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ResourceRoleRef record);

    int insertSelective(ResourceRoleRef record);

    ResourceRoleRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResourceRoleRef record);

    int updateByPrimaryKey(ResourceRoleRef record);

}
