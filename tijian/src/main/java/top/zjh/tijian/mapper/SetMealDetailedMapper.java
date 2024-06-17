package top.zjh.tijian.mapper;

import top.zjh.tijian.pojo.SetMealDetailed;

public interface SetMealDetailedMapper {
    int deleteByPrimaryKey(Integer sdId);

    int insert(SetMealDetailed record);

    int insertSelective(SetMealDetailed record);

    SetMealDetailed selectByPrimaryKey(Integer sdId);

    int updateByPrimaryKeySelective(SetMealDetailed record);

    int updateByPrimaryKey(SetMealDetailed record);
}