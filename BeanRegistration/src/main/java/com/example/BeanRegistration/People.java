package com.example.BeanRegistration;

import java.util.ArrayList;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    ArrayList<PersonType> personList = new ArrayList<>();

    public People(ArrayList<PersonType> personList) {
        this.personList = personList;
    }
    public void add(PersonType personType) {
        personList.add(personType);
    }
    public void remove(PersonType personType) {
        personList.remove(personType);
    }
    public int size() {
        return personList.size();
    }
    public void clears() {
        personList.clear();
    }
    public void addAll(PersonType[] personTypes) {
        for (PersonType pt : personTypes) {
            add(pt);
        }
    }
    public PersonType findById(long id) {
        for (PersonType pt : personList) {
            if (pt.getId() == id) {
                return pt;
            }
        }
        return null;
    }
    public ArrayList<PersonType> findAll() {
        return personList;
    }
}
