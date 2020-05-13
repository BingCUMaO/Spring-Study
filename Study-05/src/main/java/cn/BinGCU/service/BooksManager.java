package cn.BinGCU.service;

import cn.BinGCU.pojo.Book;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component("manager")
public class BooksManager {

    @Autowired
    private Book book;
}
