package cn.BinGCU.services;

import cn.BinGCU.pojo.Person;
import cn.BinGCU.pojo.PersonImpl;

public class PersonServiceImpl implements Person {
    private PersonImpl person;

    public int getId() {
        return person.getId();
    }

    public void setId(int id) {
        this.person.setId(id);
    }

    public String getName() {
        return person.getName();
    }

    public void setName(String name) {
        this.person.setName(name);
    }

    public PersonImpl getPerson() {
        return person;
    }

    public void setPerson(PersonImpl person) {
        this.person = person;
    }
}
