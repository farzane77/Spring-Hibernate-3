package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {


            Manager manager1 = (Manager) Spring.getBean("man");
        Manager manager2 = (Manager) Spring.getBean("man");
        Manager manager3 = (Manager) Spring.getBean("man");
        System.out.println(manager1);
        System.out.println(manager3);
        System.out.println(manager2);


    }
}
