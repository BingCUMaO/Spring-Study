package Test;

import cn.BinGCU.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPojo {

    @Test
    public void testPojo(){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student01 = (Student) context.getBean("Student01");

        System.out.println(student01);
    }
}
