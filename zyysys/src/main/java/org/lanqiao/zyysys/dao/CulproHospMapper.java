package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.CulproHosp;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproHosp
 */
public interface CulproHospMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproHosp record);

    int insertSelective(CulproHosp record);

    CulproHosp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproHosp record);

    int updateByPrimaryKey(CulproHosp record);

}
