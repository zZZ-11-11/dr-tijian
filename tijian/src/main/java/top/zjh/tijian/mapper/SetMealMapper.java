package top.zjh.tijian.mapper;

import org.apache.ibatis.annotations.Select;
import top.zjh.tijian.dto.SetMealDto;
import top.zjh.tijian.pojo.CheckItem;
import top.zjh.tijian.pojo.SetMeal;

import java.util.List;

public interface SetMealMapper {
    int deleteByPrimaryKey(Integer smId);

    int insert(SetMeal record);

    int insertSelective(SetMeal record);

    SetMeal selectByPrimaryKey(Integer smId);

    int updateByPrimaryKeySelective(SetMeal record);

    int updateByPrimaryKey(SetMeal record);

    @Select("select smId , name, type, price from setmeal where type=#{type}")
    List<SetMealDto> listSetMealByType(Integer type);

    @Select("select c.ciId as ciId,ciName,ciContent,meaning,remarks from setmealdetailed sd join checkitem c on sd.ciId=c.ciId where sd.smId=#{smId}")
    List<CheckItem> listCheckItemBySmId(Integer smId);
}