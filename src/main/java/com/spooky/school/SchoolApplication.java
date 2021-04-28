package com.spooky.school;

import com.spooky.school.model.*;
import com.spooky.school.service.XmlSchoolService;
import com.spooky.school.util.DateFormatUtils;
import com.spooky.school.util.DefaultGenerator;
import com.spooky.school.util.SemesterUtils;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

public class SchoolApplication {
    public static void main(String[] args) {
        XmlSchoolService schoolService = new XmlSchoolService();
        School school = schoolService.loadSchool("oxford.xml");
        schoolService.saveSchool(school,"oxford.xml");;
        DefaultGenerator.createSchool();
    }
}
