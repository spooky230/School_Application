package com.spooky.school.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.LinkedList;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Student extends Human {
    private Group group;
    private Results results;
    public Student(long id,String firstName, String lastName, String phoneNumber, String address, Date dateOfBirth) {
        super(firstName, lastName, phoneNumber, address, dateOfBirth, id);
//        this.results = new LinkedList<>();
    }
    public Student(long id,String firstName, String lastName, String phoneNumber, String address, String dateOfBirth) {
        super(firstName, lastName, phoneNumber, address, dateOfBirth, id);
//        this.results = new LinkedList<>();
    }
    public Student() {
    }
}
