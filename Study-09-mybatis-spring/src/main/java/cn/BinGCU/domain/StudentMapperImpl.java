package cn.BinGCU.domain;

import cn.BinGCU.dao.StudentMapper;
import cn.BinGCU.pojo.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("studentMapper")
public class StudentMapperImpl implements StudentMapper {
    //如果直接继承SqlSessionDaoSupport 抽象类，就可以不用自定义这个属性
    private SqlSessionTemplate sqlSession;

    @Autowired
    @Qualifier("sqlSession")
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Student> selectAllStudent() {
        return sqlSession.getMapper(StudentMapper.class).selectAllStudent();
    }

    @Override
    public Student selectStudentById(int id) {
        return sqlSession.getMapper(StudentMapper.class).selectStudentById(id);
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        return sqlSession.getMapper(StudentMapper.class).selectStudentByName(name);
    }

    @Override
    public int insertStudent(Student student) {
        return sqlSession.getMapper(StudentMapper.class).insertStudent(student);
    }

    @Override
    public int insertStudents(List<Student> students) {
        return sqlSession.getMapper(StudentMapper.class).insertStudents(students);
    }

    @Override
    public int updateStudentById(Map<String, Object> datas) {
        return sqlSession.getMapper(StudentMapper.class).updateStudentById(datas);
    }

    @Override
    public int deleteStudentById(int id) {
        return sqlSession.getMapper(StudentMapper.class).deleteStudentById(id);
    }
}
