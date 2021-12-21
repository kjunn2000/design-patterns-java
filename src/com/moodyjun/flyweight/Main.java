package com.moodyjun.flyweight;

public class Main {
    public static void main(String[] args) {
        Student.setUniName("APU");
        Student.setUniAddr("Bukit Jalil");

        Student student = new Student();
        student.setStudentId("TP00001");
        student.setStudentName("Josh");
        student.setAge(20);

        Student student2 = new Student();
        student2.setStudentId("TP00002");
        student2.setStudentName("Marry");
        student2.setAge(23);

        System.out.println(student);
        System.out.println(student2);
    }
}
