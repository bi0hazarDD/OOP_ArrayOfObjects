package com.company;

public class Main {

    public static void main(String[] args) {
        // creating objects
        Student steve = new Student();
        Student joe = new Student();
        Student rick = new Student();
        //example simple int array
        int[] marks = new int[10];
        // creating array of objects , only accepting type Student
        Student[] studentsArray = new Student[3];


        //storing objects reference into array (of objects)
        studentsArray[0] = steve;
        studentsArray[1] = joe;
        studentsArray[2] = rick;
        // set steve name and age
        steve.setNameAndAge("steve",24);
        // can also access the object in the array using index and use method from the class as we are referencing the object
        // set rick name and age
        studentsArray[2].setNameAndAge("rick",21);

//        steve.introduce();
        studentsArray[0].introduce(); // introduce steve
        studentsArray[1].introduce(); // introduce joe
        studentsArray[2].introduce(); // introduce rick




    }
}
