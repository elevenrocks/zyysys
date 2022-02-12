package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.Role;

/**
 * @Entity org.lanqiao.zyysys.domain.Role
 */
public interface RoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
