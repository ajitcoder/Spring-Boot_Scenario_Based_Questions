package com.ajit.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ajit.Proj16StudentCourseRegistrationSystemApplication;
import com.ajit.sbeans.StudentConfig;

@Service
public class StudentService {

    private final Proj16StudentCourseRegistrationSystemApplication proj16StudentCourseRegistrationSystemApplication;
@Autowired
 StudentConfig confg;

    StudentService(Proj16StudentCourseRegistrationSystemApplication proj16StudentCourseRegistrationSystemApplication) {
        this.proj16StudentCourseRegistrationSystemApplication = proj16StudentCourseRegistrationSystemApplication;
    }
public void displayStudentInfo() {
System.out.println("Student Details:");	
System.out.println("ID           : "+confg.getStudentId());
System.out.println("Name         : "+confg.getStudentName());
System.out.println("Department   : "+confg.getDepartment());
System.out.println("\nMarks (Array):"+Arrays.toString(confg.getMarks()));
System.out.println("Courses      : "+confg.getCourses());
System.out.println("Skills       : "+confg.getSkills());
 Map<String, Double> cgpa = confg.getCgpa();
 System.out.println("CGPA         :");
 Set<Entry<String, Double>> entrySet = cgpa.entrySet();
          Iterator<Entry<String, Double>> empty = entrySet.iterator();
 while(empty.hasNext()) {
	 Entry<String, Double> next = empty.next();
	 System.out.println(next.getKey()+" = "+next.getValue());
 }
 //System.out.println(cgpa);
}
 
}
