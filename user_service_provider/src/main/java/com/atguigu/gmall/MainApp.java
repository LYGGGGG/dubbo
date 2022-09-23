package com.atguigu.gmall;

/*
@author YG
@create 2022/9/23   16:37
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
    }
}
