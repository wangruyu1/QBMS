package cn.qtech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.qtech.mapper")
public class QbmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QbmsApplication.class, args);
	}
}
