package com.grit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        /**Instantiate Objects here.
         *
         * */
        RecordCatalogue r1 = new RecordCatalogue("Grit");
        ReadFileAndInstantiateObjects(r1);
        var StudentsInfo = r1.getStudentsInfo();
        for(var studentInfo : StudentsInfo)
        {
            System.out.println(studentInfo);
        }
    }

    public static void ReadFileAndInstantiateObjects(RecordCatalogue recordCatalogue) throws FileNotFoundException {
        File file = new File("C:\\Users\\rafae\\IdeaProjects\\SomeApp\\src\\com\\grit\\students.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            var line = scanner.nextLine();
            var InfoLine = line.split(":");
            var NameAge = InfoLine[0].split(",");
            var gradesArr = InfoLine[1].split(",");

            //Handle Name and Age
            var StudentName = NameAge[0];
            var StudentAge = Integer.parseInt(NameAge[1]);
            Student s = new Student(StudentName, StudentAge);


            ////Handle Grades
            for(var grade : gradesArr)
            {
                s.AddGrade(Integer.parseInt(grade));
            }
            recordCatalogue.AddStudent(s);
        }
    }


}
