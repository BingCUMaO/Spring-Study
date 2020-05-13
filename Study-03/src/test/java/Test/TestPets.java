package Test;


import cn.BinGCU.pojo.AninalImpl.Cat;
import cn.BinGCU.pojo.AninalImpl.Dog;
import cn.BinGCU.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPets {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(context.getBean("catttttttt", Cat.class));
        System.out.println(context.getBean("doggggg", Dog.class));
        System.out.println(context.getBean("caTT", Cat.class));
        System.out.println(context.getBean("doGG", Dog.class));


        System.out.println("---------------------------------------");

        Person person = context.getBean("person", Person.class);
        person.managePets();
        System.out.println("C命名空间");
        System.out.println(person);

        System.out.println("--------------Sub----------------");

        Person personnnnnn =  context.getBean("personnnnnn", Person.class);
        personnnnnn.managePets();
        System.out.println("P命名空间");
        System.out.println(personnnnnn);

        System.out.println("--------------Sub----------------");

        Person personNNN =  context.getBean("personNNN", Person.class);
        System.out.println(personNNN);

        System.out.println("--------------Sub----------------");

        System.out.println(personnnnnn.getCat()==personNNN.getCat());
        System.out.println(personnnnnn.getDog()==personNNN.getDog());

        System.out.println("--------------Sub----------------");

        Person personNNN2 =  context.getBean("personNNN2", Person.class);
        System.out.println(personNNN2);
    }
}
