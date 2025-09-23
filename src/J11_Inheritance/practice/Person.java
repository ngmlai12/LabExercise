package J11_Inheritance.practice;

public class Person {
    private String name;
    private char gender;

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void details(){
        System.out.println(name+" "+gender+".");
    }

    public void doing(){
        System.out.println(name + " is eating.");
    }
}
