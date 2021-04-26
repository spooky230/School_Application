package com.spooky.school.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id","name","classNumber","curator","students"})
public class Group {
    @XmlAttribute
    private long id;
    @XmlAttribute
    private String name;
    @XmlAttribute
    private int classNumber;
    @XmlElement
    private Teacher curator;
    @XmlElement(name = "Student")
    @XmlElementWrapper(name = "Students")
    private List<Student> students;

    public Group() {
        this.students = new LinkedList<>();
    }

    public Group(long id,String name, Teacher curator, int classNumber) {
        this();
        this.id = id;
        this.name = name;
        this.curator = curator;
        this.classNumber = classNumber;
    }
}
