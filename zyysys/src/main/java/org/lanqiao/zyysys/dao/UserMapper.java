package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.User;

/**
 * @Entity org.lanqiao.zyysys.domain.User
 */
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
