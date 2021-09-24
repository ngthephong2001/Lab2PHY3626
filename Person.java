package Lession2.DayTwo;

public class Person {
    private String name;
    private int age;
    private char gender;
    private String emailAddress;

    public Person() {

    }

    public Person(String name, int age, char gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + getName() + "'" + ", age='" + getAge() + "'" + ", gender='" + getGender() + "'"
                + ", emailAddress='" + getEmailAddress() + "'";
    }

    public void display() {
        System.out.println(this.toString());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
