import com.service.UserService;
import org.junit.Test;
import org.junit.internal.builders.JUnit4Builder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author ：chenchao06
 * @description： file name
 * @mobile ：18676838076
 * @date ：Created in 2019/9/25 20:51
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class TestSpring {

    @Resource
    UserService userService;
    @Test
    public void testXmlBeanFactory(){
        try {
            userService.say();
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
