package org.lanqiao.zyysys.service;

import org.lanqiao.zyysys.domain.User;

/**
 *
 */
public interface UserService  {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
