package com.moodyjun.prototype;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.setStudentId("TP00001");
        student.setStudentName("Josh");
        student.setAge(20);

        System.out.println(student);

        try {
            Student cloneStudent = (Student) student.clone();
            System.out.println(cloneStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
