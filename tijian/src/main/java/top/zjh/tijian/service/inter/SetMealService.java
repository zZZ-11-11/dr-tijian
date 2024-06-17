package top.zjh.tijian.service.inter;

import top.zjh.tijian.dto.SetMealDto;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.pojo.SetMeal;

import java.util.List;


public interface SetMealService {
    Result<List<SetMealDto>> listSetMealByType(Integer type);

    Result<SetMeal> getSetMealById(Integer smId);
}
