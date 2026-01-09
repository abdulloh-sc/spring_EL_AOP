package uz.pdp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc_settings.xml");
        Performance performance = context.getBean(Performance.class);
        try {
            performance.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}