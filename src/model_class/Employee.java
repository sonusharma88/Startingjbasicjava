package model_class;

public class Employee {

    // Model Class of Employee

    String name;
    String post;
    int id;
    int salary;
    // using parametrized constructor

    public Employee(String name, String post, int id, int salary) {
        this.name = name;
        this.post = post;
        this.id = id;
        this.salary = salary;
    }
    // using getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
