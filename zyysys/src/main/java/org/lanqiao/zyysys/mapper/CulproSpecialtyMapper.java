package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.CulproSpecialty;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproSpecialty
 */
public interface CulproSpecialtyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproSpecialty record);

    int insertSelective(CulproSpecialty record);

    CulproSpecialty selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproSpecialty record);

    int updateByPrimaryKey(CulproSpecialty record);

}
