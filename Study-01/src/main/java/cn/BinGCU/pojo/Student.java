package cn.BinGCU.pojo;

import lombok.Data;

@Data
public class Student extends PersonImpl {
    private static final long serialVersionUID = -8740219424997111817L;

    public Student() {
    }

    public Student(String name){
        super.setName(name);
    }
}
