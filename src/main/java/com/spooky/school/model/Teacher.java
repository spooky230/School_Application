package com.spooky.school.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Teacher extends Human {
    private Group group;
    @XmlElement(name = "Subject")
    @XmlElementWrapper(name = "Subjects")
    private List<Subject> subjects;

    public Teacher(String firstName, String lastName, String phoneNumber, String address, Date dateOfBirth, long id) {
        super(firstName, lastName, phoneNumber, address, dateOfBirth, id);
        this.subjects = new LinkedList<>();
    }

    public Teacher(){
        this.subjects = new LinkedList<>();
    }
}
