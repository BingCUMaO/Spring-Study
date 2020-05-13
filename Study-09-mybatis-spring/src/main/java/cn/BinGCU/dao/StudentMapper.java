package cn.BinGCU.dao;

import cn.BinGCU.pojo.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
     List<Student> selectAllStudent();;

     Student selectStudentById(int id);

     List<Student> selectStudentByName(String name);

     int insertStudent(Student student);

     int insertStudents(List<Student> students);

     int updateStudentById(Map<String, Object> datas);

     int deleteStudentById(int id);
}
