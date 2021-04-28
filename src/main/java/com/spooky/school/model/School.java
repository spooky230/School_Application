package com.spooky.school.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;
@Data
@XmlRootElement(name = "School")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id","name","adress","phone","city","country","groupsList","teachersList","director","studyingPlan"})
public class School {
    @XmlAttribute
    private long id;
    @XmlAttribute
    private String name;
    @XmlElement
    private String adress;
    @XmlElement
    private String phone;
    @XmlElement
    private String city;
    @XmlElement
    private String country;
    @XmlElement(name = "Group")
    @XmlElementWrapper(name = "Groups")
    private List<Group> groupsList;
    @XmlElement(name = "Teacher")
    @XmlElementWrapper(name = "Teachers")
    private List<Teacher> teachersList;
    @XmlElement(name = "Director")
    private Teacher director;
    @XmlElement(name = "StudyingPlan")
    private StudyingPlan studyingPlan;
    public School ( long id,String name, String adress, String phone, String city, String country,Teacher director){
        this();
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.id = id;
        this.director = director;
    }
    public School (){
        groupsList = new LinkedList<>();
        teachersList = new LinkedList<>();
        studyingPlan = new StudyingPlan();
    }

}
