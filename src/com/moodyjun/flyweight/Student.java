package com.moodyjun.flyweight;

public class Student{
    private String studentId;
    private String studentName;
    private int age;
    private static String uniName;
    private static String uniAddr;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getUniName() {
        return uniName;
    }

    public static void setUniName(String uniName) {
        Student.uniName = uniName;
    }

    public static String getUniAddr() {
        return uniAddr;
    }

    public static void setUniAddr(String uniAddr) {
        Student.uniAddr = uniAddr;
    }

    @Override
    public String toString() {
        return studentId + "-" + studentName + "-" + age + "-" + uniName + "-" + uniAddr;
    }
}
