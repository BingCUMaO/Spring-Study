package cn.BinGCU.pojo.AninalImpl;

import cn.BinGCU.pojo.Animal;
import lombok.Data;

@Data
public class Cat implements Animal {
    private String name;

    @Override
    public void shout() {
        System.out.println("Cat: miao~");
    }
}
