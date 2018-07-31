package com.tedBilgar;

public class Student {
    private String studentMessage;

    public String getStudentMessage() {
        return studentMessage;
    }

    public void setStudentMessage(String studentMessage) {
        StudentHelper studentHelper = new StudentHelper();
        studentHelper.setMessage("Tips from Student helper");
        this.studentMessage = studentHelper.getMessage();
    }

    public void generateStudentMessage(){
        //StudentHelper studentHelper = new StudentHelper("Tips from StudentHelper");
        //this.studentMessage =  studentHelper.generateStudentHelperMessage();
        //return this.studentMessage;
    }
}
