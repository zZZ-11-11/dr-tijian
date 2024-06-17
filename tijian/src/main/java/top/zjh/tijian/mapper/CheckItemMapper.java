package top.zjh.tijian.mapper;

import top.zjh.tijian.pojo.CheckItem;

public interface CheckItemMapper {
    int deleteByPrimaryKey(Integer ciId);

    int insert(CheckItem record);

    int insertSelective(CheckItem record);

    CheckItem selectByPrimaryKey(Integer ciId);

    int updateByPrimaryKeySelective(CheckItem record);

    int updateByPrimaryKey(CheckItem record);
}