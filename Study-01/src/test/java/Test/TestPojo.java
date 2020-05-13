package Test;

import cn.BinGCU.services.PersonServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPojo {

    @Test
    public void testApplicationContext(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        PersonServiceImpl personServiceImpl = (PersonServiceImpl)applicationContext.getBean("PersonServiceImpl");

        System.out.println(personServiceImpl.getId());
        System.out.println(personServiceImpl.getName());
    }
}
