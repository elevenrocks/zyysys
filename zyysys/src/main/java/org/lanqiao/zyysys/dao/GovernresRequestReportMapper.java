package org.lanqiao.zyysys.dao;

import org.lanqiao.zyysys.domain.GovernresRequestReport;

/**
 * @Entity org.lanqiao.zyysys.domain.GovernresRequestReport
 */
public interface GovernresRequestReportMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GovernresRequestReport record);

    int insertSelective(GovernresRequestReport record);

    GovernresRequestReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovernresRequestReport record);

    int updateByPrimaryKey(GovernresRequestReport record);

}
