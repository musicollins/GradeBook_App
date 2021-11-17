package com.grit;

import java.util.ArrayList;
import java.util.List;

public class RecordBook {
    private List<Integer> Grades;

    public RecordBook() {
        Grades = new ArrayList<>();
    }

    public void AddGrade(int grade)
    {
/*        if(Grades.size() >= 4){
            System.out.println("You Cannot Have more than " + Grades.size() + " grades");
        }else{*/
            Grades.add(grade);
        //}
    }

    public void AddAllGrades(List<Integer> allGrades){
        Grades = allGrades;
    }

    public List<Integer> getGrades()
    {
        return Grades;
    }
}
