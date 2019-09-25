package test;

import com.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/25 21:16
 * @modified By：
 * @version: 1.0
 */
public class TestSpring {
    public static void main(String[] args) {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
            BeanFactory factory = ((ClassPathXmlApplicationContext) applicationContext).getBeanFactory();
            UserService userService = (UserService)factory.getBean("userService");
            userService.say();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
