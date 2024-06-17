package top.zjh.tijian;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.zjh.tijian.dto.CalendarRequestDto;
import top.zjh.tijian.dto.CalendarResponseDto;
import top.zjh.tijian.service.inter.CalendarService;

import java.util.List;

@SpringBootTest
class TijianApplicationTests {
    @Autowired
    private CalendarService calendarService;

    @Test
    void contextLoads() {
    }

}
