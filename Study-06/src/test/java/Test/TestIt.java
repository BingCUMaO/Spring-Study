package Test;

import cn.BinGCU.pojo.Book;
import cn.BinGCU.service.BooksManager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIt {

    @Test
    public void testJavaConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(cn.BinGCU.config.Config01.class);
        Book book = context.getBean("_book", Book.class);
        System.out.println(book);

        BooksManager manager = context.getBean("manager", BooksManager.class);
        System.out.println(manager);
    }
}
