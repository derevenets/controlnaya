package ru.sapteh;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private String birthDay;
    private String speciality;
    private int course;
    private String group;

    Student(int id, String firstName,
            String secondName, String birthDay,
            String speciality, int course, String group){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDay = birthDay;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public String getBirthDay(){
        return birthDay;
    }
    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }
    public String getSpeciality(){
        return speciality;
    }
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }
    public int getCourse(){
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
}
}
