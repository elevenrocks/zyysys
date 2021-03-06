package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.Dictitem;

/**
 * @Entity org.lanqiao.zyysys.domain.Dictitem
 */
public interface DictitemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dictitem record);

    int insertSelective(Dictitem record);

    Dictitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dictitem record);

    int updateByPrimaryKey(Dictitem record);

}
