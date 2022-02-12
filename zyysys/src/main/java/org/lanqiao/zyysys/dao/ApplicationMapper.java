package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.Application;

/**
 * @Entity org.lanqiao.zyysys.domain.Application
 */
public interface ApplicationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);

}
