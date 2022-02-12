package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.Dict;

/**
 * @Entity org.lanqiao.zyysys.domain.Dict
 */
public interface DictMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);

}
