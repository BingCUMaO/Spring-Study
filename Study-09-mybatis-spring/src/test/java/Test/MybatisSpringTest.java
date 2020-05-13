package Test;

import cn.BinGCU.dao.StudentMapper;
import cn.BinGCU.pojo.Student;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSpringTest {


    @Test
    public void ServiceTest(){
        //这一步始终都还是要的，哎
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);

        for (Student student : studentMapper.selectAllStudent()) {
            System.out.println("[DEBUG]==>" + student);
        }

        studentMapper.selectStudentById(3);

    }
}
