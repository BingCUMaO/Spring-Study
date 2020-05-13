package Test;

import cn.BinGCU.pojo.HeroImlp.LuXun;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void testAnnotationAutowried(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LuXun hero = context.getBean("hero", LuXun.class);
        System.out.println(hero);

    }
}
