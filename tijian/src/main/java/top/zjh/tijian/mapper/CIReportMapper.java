package top.zjh.tijian.mapper;

import top.zjh.tijian.pojo.CIReport;

public interface CIReportMapper {
    int deleteByPrimaryKey(Integer cirId);

    int insert(CIReport record);

    int insertSelective(CIReport record);

    CIReport selectByPrimaryKey(Integer cirId);

    int updateByPrimaryKeySelective(CIReport record);

    int updateByPrimaryKey(CIReport record);
}