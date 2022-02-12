package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.Log;

/**
 * @Entity org.lanqiao.zyysys.domain.Log
 */
public interface LogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

}
