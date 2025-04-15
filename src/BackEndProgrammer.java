public class BackEndProgrammer extends Programmer {
    public BackEndProgrammer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public String toString() {
        return "BackEndProgrammer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
