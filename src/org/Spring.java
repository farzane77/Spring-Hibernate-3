package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
   private static ApplicationContext diContainer = new ClassPathXmlApplicationContext("spring.xml");
    public static Object getBean(String beanId)
    {
        return diContainer.getBean(beanId);
    }
}
