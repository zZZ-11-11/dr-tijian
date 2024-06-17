package top.zjh.tijian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zjh.tijian.dto.SetMealDto;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.pojo.SetMeal;
import top.zjh.tijian.service.inter.SetMealService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/setMeal")
public class SetMealController {
    @Autowired
    private SetMealService setMealService;

    @GetMapping("/listSetMealByType")
    public Result<List<SetMealDto>> listSetMealByType(Integer type) {
        return setMealService.listSetMealByType(type);
    }

    @GetMapping("/getSetMealById")
    public Result<SetMeal> getSetMealById(Integer smId) {
        return setMealService.getSetMealById(smId);
    }
}
