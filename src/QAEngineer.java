public class QAEngineer extends Employee {
    public QAEngineer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public String toString() {
        return "QAEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
