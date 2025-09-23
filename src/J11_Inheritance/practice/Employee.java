package J11_Inheritance.practice;

public class Employee extends Person {
    private int id;
    private int salary;

    public Employee(String name, char gender, int id, int salary) {
        super(name, gender);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void details(){
        System.out.println("Worker: "+getName()+", "+getGender()+", Id: "+id+", $"+salary+".");
    }

    @Override
    public void doing() {
        System.out.println(getName() + " is working.");
    }
}
