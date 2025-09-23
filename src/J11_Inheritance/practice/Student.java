package J11_Inheritance.practice;

public class Student extends Person{
    private int sid;
    private int years;

    public Student(String name, char gender, int sid, int years) {
        super(name, gender);
        this.sid = sid;
        this.years = years;
    }

    @Override
    public void details(){
        System.out.println("Student: "+getName()+", "+getGender()+", Student Id: "+sid+", Year "+years+".");
    }

    @Override
    public void doing() {
        System.out.println(getName() + " is sleeping.");
    }
}
