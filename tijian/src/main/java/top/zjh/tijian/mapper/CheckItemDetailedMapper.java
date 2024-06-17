package top.zjh.tijian.mapper;

import top.zjh.tijian.pojo.CheckItemDetailed;

public interface CheckItemDetailedMapper {
    int deleteByPrimaryKey(Integer cdId);

    int insert(CheckItemDetailed record);

    int insertSelective(CheckItemDetailed record);

    CheckItemDetailed selectByPrimaryKey(Integer cdId);

    int updateByPrimaryKeySelective(CheckItemDetailed record);

    int updateByPrimaryKey(CheckItemDetailed record);
}