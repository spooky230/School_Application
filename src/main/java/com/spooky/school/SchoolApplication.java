package com.spooky.school;

import com.spooky.school.model.*;
import com.spooky.school.service.XmlSchoolService;
import com.spooky.school.util.DateFormatUtils;
import com.spooky.school.util.SemesterUtils;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

public class SchoolApplication {
    public static void main(String[] args) {
//        Teacher teacher = new Teacher("terry","laxso","21572316","London24",new Date(),1);
//        Teacher teacher1 = new Teacher("jerry","ferlot","2157756","London33",new Date(),2);
//        Teacher teacher2 = new Teacher("gerry","Ompato","21571916","London14",new Date(),3);//Todo::create more teachers and stundents and groups in new schools
//
//        Group group = new Group(1,"Class One A",teacher,1);
//        Group group1 = new Group(2,"Class One B",teacher1,2);
//        Group group2 = new Group(3,"Class One C",teacher2,3);
//        Subject subject=new Subject(1,"algebra","this is algebra");
//        Subject subject1 =new Subject(2,"geometry","science about figures");
//        Subject subject2 =new Subject(3,"english","most popular language in whole world");
//        Subject subject3=new Subject(4,"French","there are a lot of cool literature");
//        teacher1.getSubjects().add(subject);
//        teacher1.getSubjects().add(subject1);
//        teacher2.getSubjects().add(subject2);
//        teacher2.getSubjects().add(subject3);
//        Student student=new Student(1,"Ivan","Ivanov","5564564","river str. h.11 fl.25","19.02.2005");
//        Student student1=new Student(2,"James","Ackerley","5564564","river str. h.11 fl.215","21.03.2005");
//        Student student2=new Student(3,"Robert","Backerly","5564564","river str. h.11 fl.225","12.04.2005");
//        Student student3=new Student(4,"John","Eckerman","5564564","river str. h.11 fl.72","05.05.2005");
//        Student student4=new Student(5,"Joseph","Backermann","5564564","river str. h.11 fl.45","15.06.2005");
//        Student student5=new Student(6,"Andrew","Dackers","5564564","river str. h.11 fl.32","18.02.2005");
//        Student student6=new Student(7,"Ryan","Packerson","5564564","river str. h.11 fl.74","28.06.2005");
//        Student student7=new Student(8,"Brandon","Rackert","5564564","river str. h.11 fl.83","07.08.2005");
//        Student student8=new Student(9,"Jason","Ackison","5564564","river str. h.11 fl.96","09.11.2005");
//        Student student9=new Student(10,"Justin","Nackiss","5564564","river str. h.11 fl.121","02.02.2005");
//        Student student10=new Student(11,"Sarah","Yackland","5564564","river str. h.11 fl.17","05.02.2005");
//        Student student11=new Student(12,"William","Facklen","5564564","river str. h.11 fl.1","17.12.2005");
//        Student student12=new Student(13,"Jonathan","Ackles","5564564","river str. h.11 fl.89","22.02.2005");
//        group1.getStudents().add(student);
//        group1.getStudents().add(student1);
//        group1.getStudents().add(student2);
//        group1.getStudents().add(student3);
//        group1.getStudents().add(student4);
//        group1.getStudents().add(student5);
//        group1.getStudents().add(student6);
//        group2.getStudents().add(student7);
//        group2.getStudents().add(student8);
//        group2.getStudents().add(student9);
//        group2.getStudents().add(student10);
//        group2.getStudents().add(student11);
//        group2.getStudents().add(student12);
//        School school =new School(1,"oxford","London28","021521253","London","UK",teacher);
//        school.getTeachersList().add(teacher1);
//        school.getTeachersList().add(teacher2);
//        school.getGroupsList().add(group1);
//        school.getGroupsList().add(group2);
//        XmlSchoolService schoolService = new XmlSchoolService();
//        School school = schoolService.loadSchool("oxford.xml");
//        schoolService.saveSchool(school,"oxford.xml");
        Date date = DateFormatUtils.convertStringToDate("10-10-2020");
        Date date1 = DateFormatUtils.convertStringToDate("8-10-2020");
        Date date2 = DateFormatUtils.convertStringToDate("3-10-2020");
        System.out.println(SemesterUtils.getSemesterFromDate(date));
        System.out.println(SemesterUtils.getSemesterFromDate(date1));
        System.out.println(SemesterUtils.getSemesterFromDate(date2));
    }
}
