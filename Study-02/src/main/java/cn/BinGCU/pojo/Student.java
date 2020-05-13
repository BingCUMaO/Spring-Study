package cn.BinGCU.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
public class Student extends PersonImpl {
    private static final long serialVersionUID = -8740219424997111817L;
    private String[] books;
    private List hobits;
    private Map scores;
    private Properties props;


    public Student() {
    }

    public Student(String name){
        super.setName(name);
    }

    public void initMethod(){
        System.out.println("In initMethod");
    }

    public void destroyMethod(){
        System.out.println("In destroyMethod");
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List getHobits() {
        return hobits;
    }

    public void setHobits(List hobits) {
        this.hobits = hobits;
    }

    public Map getScores() {
        return scores;
    }

    public void setScores(Map scores) {
        this.scores = scores;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
