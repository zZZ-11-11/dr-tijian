package top.zjh.tijian.service.inter;

import top.zjh.tijian.dto.CalendarRequestDto;
import top.zjh.tijian.dto.CalendarResponseDto;
import top.zjh.tijian.pojo.Result;

import java.util.List;

public interface CalendarService {
    //获取当前年和当前月的日历
    Result<List<CalendarResponseDto>> listAppointmentCalendar(CalendarRequestDto dto);
}
