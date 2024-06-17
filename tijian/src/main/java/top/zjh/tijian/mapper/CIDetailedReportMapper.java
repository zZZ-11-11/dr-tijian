package top.zjh.tijian.mapper;

import top.zjh.tijian.pojo.CIDetailedReport;

public interface CIDetailedReportMapper {
    int deleteByPrimaryKey(Integer cidrId);

    int insert(CIDetailedReport record);

    int insertSelective(CIDetailedReport record);

    CIDetailedReport selectByPrimaryKey(Integer cidrId);

    int updateByPrimaryKeySelective(CIDetailedReport record);

    int updateByPrimaryKey(CIDetailedReport record);
}