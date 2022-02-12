package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.CulproPreTre;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproPreTre
 */
public interface CulproPreTreMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproPreTre record);

    int insertSelective(CulproPreTre record);

    CulproPreTre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproPreTre record);

    int updateByPrimaryKey(CulproPreTre record);

}
