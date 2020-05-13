package cn.BinGCU.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("_book")
public class Book {

    @Value("《从零开始》")
    private String bookName;
}
