package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(SpringBootApplication.class);
//        app.setBanner(new Banner() {
//            @Override
//            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//                out.printf("==============================================================");
//                out.printf("==============================================================");
//            }
//        });
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
            new SpringApplicationBuilder()
                    .sources(SpringApplication.class)
                    .run(args);
    }

}
