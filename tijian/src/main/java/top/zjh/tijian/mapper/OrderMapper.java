package top.zjh.tijian.mapper;

import org.apache.ibatis.annotations.Select;
import top.zjh.tijian.dto.CalendarResponseDto;
import top.zjh.tijian.dto.OrdersMapperDto;
import top.zjh.tijian.pojo.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<CalendarResponseDto> listOrdersAppointmentNumber(List<OrdersMapperDto> parameList);
}