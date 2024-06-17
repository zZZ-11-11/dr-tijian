package top.zjh.tijian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zjh.tijian.dto.CalendarRequestDto;
import top.zjh.tijian.dto.CalendarResponseDto;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.service.inter.CalendarService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/calendar")
public class CalendarController {
    @Autowired
    private CalendarService calendarService;

    @PostMapping("/listAppointmentCalendar")
    public Result<List<CalendarResponseDto>> listAppointmentCalendar(@RequestBody CalendarRequestDto dto) {
        return calendarService.listAppointmentCalendar(dto);
    }
}
