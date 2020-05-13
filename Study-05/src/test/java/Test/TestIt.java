package Test;

import cn.BinGCU.pojo.Book;
import cn.BinGCU.service.BooksManager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIt {

    @Test
    public void testAnnotationComponent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = context.getBean("_book", Book.class);
        System.out.println(book);

        BooksManager manager = context.getBean("manager", BooksManager.class);
        System.out.println(manager);
    }
}
