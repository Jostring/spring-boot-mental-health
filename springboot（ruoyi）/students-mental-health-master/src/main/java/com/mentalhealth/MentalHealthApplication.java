package com.mentalhealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MentalHealthApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(MentalHealthApplication.class, args);
        System.out.println("\n\n(♥◠‿◠)ﾉﾞ    启动成功   ლ(´ڡ`ლ)ﾞ  \n\n");
        System.out.println("访问地址：http://localhost:8081\n\n");

    }
}