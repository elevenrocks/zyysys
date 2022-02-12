package org.lanqiao.zyysys.service;

import org.lanqiao.zyysys.domain.Dict;

/**
 *
 */
public interface DictService {
    int deleteByPrimaryKey(Integer id);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}
