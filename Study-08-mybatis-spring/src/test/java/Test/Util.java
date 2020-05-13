package Test;

import cn.BinGCU.dao.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Util {
    private static SqlSession sqlSession;
    private static InputStream is;

    public static StudentMapper getStudentMapper() throws IOException {
        String resource = "mybatisConfig.xml";
        is = Resources.getResourceAsStream(resource);
        sqlSession = new SqlSessionFactoryBuilder().build(is).openSession();

        return sqlSession.getMapper(StudentMapper.class);
    }

    public static void commit(){
        sqlSession.commit();
    }

    public static void close(){
        sqlSession.close();
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
