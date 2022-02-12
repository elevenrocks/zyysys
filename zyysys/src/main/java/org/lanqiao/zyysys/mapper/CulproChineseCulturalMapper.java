package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.CulproChineseCultural;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproChineseCultural
 */
public interface CulproChineseCulturalMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproChineseCultural record);

    int insertSelective(CulproChineseCultural record);

    CulproChineseCultural selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproChineseCultural record);

    int updateByPrimaryKey(CulproChineseCultural record);

}
