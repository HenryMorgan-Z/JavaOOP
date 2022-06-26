package model;

public class Student {

    String name;

    int age;

    String gender;

    String ID_NO;

    public Student(String name, int age, String gender, String ID_NO) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID_NO = ID_NO;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID_NO() {
        return ID_NO;
    }

    public void setID_NO(String ID_NO) {
        this.ID_NO = ID_NO;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ID_NO='" + ID_NO + '\'' +
                '}';
    }
}
