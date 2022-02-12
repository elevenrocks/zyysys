package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.Application;

/**
 * @Entity org.lanqiao.zyysys.domain.Application
 */
public interface ApplicationMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);

}
