package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.CulproHospSpecialtyRef;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproHospSpecialtyRef
 */
public interface CulproHospSpecialtyRefMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproHospSpecialtyRef record);

    int insertSelective(CulproHospSpecialtyRef record);

    CulproHospSpecialtyRef selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproHospSpecialtyRef record);

    int updateByPrimaryKey(CulproHospSpecialtyRef record);

}
