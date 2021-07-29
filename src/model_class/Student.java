package model_class;

public class Student {

    // Model class of student

    String name;
    int age;
    int Rollno;
    String branch;

    public Student(String name, int age, int rollno, String branch) {
        this.name = name;
        this.age = age;
        Rollno = rollno;
        this.branch = branch;
    }

    //  getter and setter using


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}
