package com.spooky.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id","name","description"})
public class Subject {
    @XmlAttribute
    private long id;
    @XmlAttribute
    private String name;
    @XmlElement
    private String description;
}
