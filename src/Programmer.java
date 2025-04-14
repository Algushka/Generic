public class Programmer extends Employee {


    public Programmer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}