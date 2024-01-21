package com.lzhang.cshm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.lzhang.cshm.config","com.lzhang.cshm.service"})
@ServletComponentScan
public class CampusSecondHandMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusSecondHandMarketApplication.class, args);
    }

}
