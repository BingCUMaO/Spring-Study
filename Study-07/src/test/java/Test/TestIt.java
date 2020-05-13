package Test;

import cn.BinGCU.advice.AfterAdvice;
import cn.BinGCU.advice.BeforeAdvice;
import cn.BinGCU.service.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIt {

    @Test
    public void testByInterface() throws Throwable {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service s = (Service) context.getBean("putItToTruck");
        s.service();

        System.out.println("-----------------分割-------------------");

        BeforeAdvice logBefore = context.getBean("logBefore", BeforeAdvice.class);
        AfterAdvice logAfter = context.getBean("logAfter", AfterAdvice.class);

        logBefore.before(null, null, null);
        logAfter.afterReturning(null, null, null, null);
    }

    @Test
    public void testByCustomClass(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service s = (Service) context.getBean("putItToMinibus");

        s.service();
    }

    @Test
    public void testByAnnotationAspect(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service s = (Service) context.getBean("installPackeage");
        s.service();
    }
}
