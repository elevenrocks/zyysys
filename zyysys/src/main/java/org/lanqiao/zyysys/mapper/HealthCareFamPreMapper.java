package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.HealthCareFamPre;

/**
 * @Entity org.lanqiao.zyysys.domain.HealthCareFamPre
 */
public interface HealthCareFamPreMapper {

    int deleteByPrimaryKey(Long id);

    int insert(HealthCareFamPre record);

    int insertSelective(HealthCareFamPre record);

    HealthCareFamPre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HealthCareFamPre record);

    int updateByPrimaryKey(HealthCareFamPre record);

}
