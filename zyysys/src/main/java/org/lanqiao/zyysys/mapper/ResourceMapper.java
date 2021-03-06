package org.lanqiao.zyysys.mapper;

import org.lanqiao.zyysys.domain.Resource;

/**
 * @Entity org.lanqiao.zyysys.domain.Resource
 */
public interface ResourceMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

}
