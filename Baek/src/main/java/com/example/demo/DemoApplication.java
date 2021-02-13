package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {
	public static void main(String args []){
		SpringApplication.run(DemoApplication.class, args);

		// 서블릿 웹 ㅅ버 팩토리 타입 빈이 없어서. enableautocomfigurationdptj 자동으로 만들어주는
		// 빈. 주석처리해서 안 만들어짐.
		// 웹 애플리케이션을 안 띄워도 되니까 주석처리하고 엡 에플리케이션이 아닌 타입으로 실행을 하는 것.
		// 오토컴피겨레이션으로 읽어들이는 것 없이도 돌리기 가능. 단 웹서버로는 추가설정 필요.
//		SpringApplication application = new SpringApplication(DemoApplication.class);
//		application.setWebApplicationType(WebApplicationType.NONE);
//		application.run(args);

		// 빈 다 등록 후 enableautoconfiguration
//		SpringApplication application = new SpringApplication(DemoApplication.class);
//		application.run(args);



	}

}
