package com.grit;

import java.util.List;

public class Student {
    /**State
     * name : String
     * */
    private String Name;
    private int Age;
    private RecordBook RecordBook;

    /**Constructor
     * class must be instantiated with a "name" parameter
     * */
    public Student(String name, int age) {
        Name = name;
        Age = age;
        RecordBook = new RecordBook();
    }
    /**Behaviour
     * getter
     * */

    public String getName() {
        return Name;
    }
    public int getAge(){
        return Age;
    }

    public void AddGrade(int grade)
    {
        RecordBook.AddGrade(grade);
    }
    public List<Integer> GetGrades(){
        return RecordBook.getGrades();
    }




}
