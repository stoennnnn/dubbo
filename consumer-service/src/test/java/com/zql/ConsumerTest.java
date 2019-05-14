package com.zql;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 张启磊 on 2019-5-15.
 */
public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoProviderApi bean = context.getBean(DemoProviderApi.class);
        String result = bean.getUser(11);
        System.out.println("comsumner result:" + result);

    }
}
