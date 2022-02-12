package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.CulproDoctor;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproDoctor
 */
public interface CulproDoctorMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproDoctor record);

    int insertSelective(CulproDoctor record);

    CulproDoctor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproDoctor record);

    int updateByPrimaryKey(CulproDoctor record);

}
