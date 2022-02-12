package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.CulproChineseMedicine;

/**
 * @Entity org.lanqiao.zyysys.domain.CulproChineseMedicine
 */
public interface CulproChineseMedicineMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CulproChineseMedicine record);

    int insertSelective(CulproChineseMedicine record);

    CulproChineseMedicine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CulproChineseMedicine record);

    int updateByPrimaryKey(CulproChineseMedicine record);

}
