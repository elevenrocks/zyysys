package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.User;

/**
 * @Entity org.lanqiao.zyysys.domain.User
 */
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
