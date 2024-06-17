package top.zjh.tijian.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zjh.tijian.mapper.CIReportMapper;
import top.zjh.tijian.mapper.OrderMapper;
import top.zjh.tijian.mapper.SetMealMapper;
import top.zjh.tijian.pojo.*;
import top.zjh.tijian.service.inter.OrderService;

import java.util.Date;
import java.util.List;

@Service

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private SetMealMapper setMealMapper;
    @Autowired
    private CIReportMapper ciReportMapper;

    @Transactional
    @Override
    public Result addOrder(Order order) {
        order.setOrderDate(new Date());
        order.setState(1);
        orderMapper.insertSelective(order);

        List<CheckItem> checkItems = setMealMapper.listCheckItemBySmId(order.getSmId());
        for (CheckItem checkItem : checkItems) {
            CIReport ciReport = new CIReport();
            ciReport.setOrderId(order.getOrderId());
            ciReport.setCiId(checkItem.getCiId());
            ciReport.setCiName(checkItem.getCiName());
            ciReportMapper.insertSelective(ciReport);

            CIDetailedReport ciDetailedReport = new CIDetailedReport();
            ciDetailedReport.setOrderId(order.getOrderId());
            ciDetailedReport.setCiId(checkItem.getCiId());
        }


        return Result.success();
    }
}
