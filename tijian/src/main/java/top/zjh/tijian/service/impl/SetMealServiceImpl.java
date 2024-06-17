package top.zjh.tijian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zjh.tijian.dto.SetMealDto;
import top.zjh.tijian.mapper.SetMealMapper;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.pojo.SetMeal;
import top.zjh.tijian.service.inter.SetMealService;

import java.util.List;

@Service
public class SetMealServiceImpl implements SetMealService {
    @Autowired
    private SetMealMapper setMealMapper;

    @Override
    public Result<List<SetMealDto>> listSetMealByType(Integer type) {
        List<SetMealDto> setMeals = setMealMapper.listSetMealByType(type);
        for (SetMealDto setMealDto : setMeals) {
            setMealDto.setCheckItems(setMealMapper.listCheckItemBySmId(setMealDto.getSmId()));
        }
        return Result.success(setMeals);
    }

    @Override
    public Result<SetMeal> getSetMealById(Integer smId) {
        return Result.success(setMealMapper.selectByPrimaryKey(smId));
    }
}
