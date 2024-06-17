package top.zjh.tijian.mapper;

import top.zjh.tijian.pojo.OverallResult;

public interface OverallResultMapper {
    int deleteByPrimaryKey(Integer orId);

    int insert(OverallResult record);

    int insertSelective(OverallResult record);

    OverallResult selectByPrimaryKey(Integer orId);

    int updateByPrimaryKeySelective(OverallResult record);

    int updateByPrimaryKey(OverallResult record);
}