package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.HealthCareChineseMedicine;

/**
 * @Entity org.lanqiao.zyysys.domain.HealthCareChineseMedicine
 */
public interface HealthCareChineseMedicineMapper {

    int deleteByPrimaryKey(Long id);

    int insert(HealthCareChineseMedicine record);

    int insertSelective(HealthCareChineseMedicine record);

    HealthCareChineseMedicine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthCareChineseMedicine record);

    int updateByPrimaryKey(HealthCareChineseMedicine record);

}
