package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.IndustrialDevelopTalRec;

/**
 * @Entity org.lanqiao.zyysys.domain.IndustrialDevelopTalRec
 */
public interface IndustrialDevelopTalRecMapper {

    int deleteByPrimaryKey(Long id);

    int insert(IndustrialDevelopTalRec record);

    int insertSelective(IndustrialDevelopTalRec record);

    IndustrialDevelopTalRec selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndustrialDevelopTalRec record);

    int updateByPrimaryKey(IndustrialDevelopTalRec record);

}
