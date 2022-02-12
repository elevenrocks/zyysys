package org.lanqiao.zyysys.service.impl;

import org.lanqiao.zyysys.domain.Dict;
import org.lanqiao.zyysys.mapper.DictMapper;
import org.lanqiao.zyysys.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class DictServiceImpl implements DictService{
    @Autowired
    private DictMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Dict record) {
        return 0;
    }

    @Override
    public int insertSelective(Dict record) {
        return 0;
    }

    @Override
    public Dict selectByPrimaryKey(Integer id) {
        System.out.println("-----------------------------------------业务层----------------");
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Dict record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Dict record) {
        return 0;
    }
}




