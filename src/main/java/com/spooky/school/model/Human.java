package com.spooky.school.model;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id","firstName","lastName","phoneNumber","address","dateOfBirth"})
public abstract class Human {
    @XmlAttribute
    protected long id;
    @XmlAttribute
    protected String firstName;
    @XmlAttribute
    protected String lastName;
    @XmlElement
    protected String phoneNumber;
    @XmlElement
    protected String address;
    @XmlElement
    protected Date dateOfBirth;

    public Human(String firstName,String lastName,String phoneNumber,String address,Date dateOfBirth,long id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }
    public Human(String firstName,String lastName,String phoneNumber,String address,String dateOfBirth,long id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        try {
            this.dateOfBirth = SIMPLE_DATE_FORMAT.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.id = id;
    }
    protected static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    public Human(){
    }
}
