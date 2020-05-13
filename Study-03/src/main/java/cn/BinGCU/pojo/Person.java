package cn.BinGCU.pojo;

import cn.BinGCU.pojo.AninalImpl.Cat;
import cn.BinGCU.pojo.AninalImpl.Dog;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Person {

    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    public Person(){}

    public Person(Cat cat) {
        this.cat = cat;
    }

    public Person(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void managePets(){
        System.out.println("Manage Dog and Cat");
        cat.shout();
        dog.shout();
    }
}
