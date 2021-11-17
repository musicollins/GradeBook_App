package com.grit;

import java.util.ArrayList;
import java.util.List;

public class RecordCatalogue {
    /**State
     * -schoolName : String
     * -Students : List<Student>
     * */
    private String SchoolName;
    private List<Student> Students;

    /**Constructor
     * class must be instantiated with a "schoolName" parameter
     * */
    public RecordCatalogue(){
        SchoolName = "";
        Students = new ArrayList<>();
    }
    public RecordCatalogue(String schoolName){
        SchoolName = schoolName;
        Students = new ArrayList<>();
    }
    public RecordCatalogue(String schoolName, List<Student> students){
        SchoolName = schoolName;
        Students = students;
    }

    /**Behaviour
     * AddStudent(Student s) : List<Student>
     * ChangeName(String n) : void
     * GetStudentNames() : List<String>
     * GetStudentsInfo() : List<String>
     *     */
    public void AddStudent(Student s){
        Students.add(s);
    }
    public String getSchoolName() {
        return SchoolName;
    }
    public List<String> getStudentNames(){
        List<String> names = new ArrayList<>();
        for(var student : Students)
        {
            names.add(student.getName());
        }
        return names;
    }
    public List<String> getStudentsInfo(){
        List<String> info = new ArrayList<>();
        for(var student : Students)
        {
            /*StringBuilder sb = new StringBuilder();
            sb.append("Student Name: "+ student.getName() + "\n");
            sb.append("Student Age: " + student.getAge() + "\n");
            info.add(sb.toString());*/

            String studentInfo = "Student Name: " + student.getName() + "\n" +
                                 "Student Age: " + student.getAge() + "\n" +
                    "StudentGrades: " + student.GetGrades() + "\n";
            info.add(studentInfo);

        }
        return info;
    }
    /*public List<Student> getStudents() {
        return Students;
    }*/
}
