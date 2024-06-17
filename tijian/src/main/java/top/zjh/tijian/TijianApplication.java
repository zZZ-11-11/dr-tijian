package top.zjh.tijian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.zjh.tijian.mapper")
public class TijianApplication {

    public static void main(String[] args) {
        SpringApplication.run(TijianApplication.class, args);
    }

}
