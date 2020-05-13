package Test;

import cn.BinGCU.dao.StudentMapper;
import cn.BinGCU.pojo.Student;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentMappperTest {

    @Test
    public void selectAllStudentTest() throws IOException {
        StudentMapper mapper = Util.getStudentMapper();
        List<Student> students = mapper.selectAllStudent();
        for (Student student : students) {
            System.out.println("[DEBUG]==>" + student);
        }
    }

    @Test
    public void selectStudentByIdTest() throws IOException {
        StudentMapper mapper = Util.getStudentMapper();
        Student student = mapper.selectStudentById(3);

        System.out.println(student);
    }

    @Test
    public void selectStudentByNameTest() throws IOException {
        StudentMapper mapper = Util.getStudentMapper();
        List<Student> bilibili = mapper.selectStudentByName("bilibili");

        for (Student student : bilibili) {
            System.out.println("[DEBUG]==>" + student);
        }
    }

    @Test
    public void insertStudentTest() throws IOException {
        StudentMapper mapper = Util.getStudentMapper();
        int row = mapper.insertStudent(new Student(7, "XXX"));
        Util.commit();
        System.out.println(row);
    }

    @Test
    public void insertStudentsTest() throws  IOException{
        StudentMapper studentMapper = Util.getStudentMapper();
        List<Student> list = new LinkedList<>();
        list.add(new Student(11, "YYY"));
        list.add(new Student(12, "YYY"));
        list.add(new Student(13, "YYY"));

        int i = studentMapper.insertStudents(list);
        Util.commit();
        System.out.println(i);
    }

    @Test
    public void updateStudentByIdTest() throws IOException{
        StudentMapper studentMapper = Util.getStudentMapper();

        Map<String, Object> map = new HashMap<>();
        map.put("id", 11);
        map.put("name", "ZZ");
        int i = studentMapper.updateStudentById(map);
        Util.commit();
        System.out.println(i);
    }

    @Test
    public void deleteStudentByIdTest() throws IOException{
        StudentMapper studentMapper = Util.getStudentMapper();

        int i = studentMapper.deleteStudentById(13);
        Util.commit();
        System.out.println(i);
    }
}
