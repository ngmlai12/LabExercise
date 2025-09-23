package J11_Inheritance.practice;

public class World {
    public static void main(String[] args) {
        Person marco = new Person("Marco", 'M');
        Employee max = new Employee("Max", 'M', 1, 5000);
        Student mm = new Student("Mm", 'M', 1, 4);

        marco.details();
        marco.doing();
        max.details();
        max.doing();
        mm.details();
        mm.doing();


    }
}
