public class  FronEndProgrammer extends Programmer {


    public FronEndProgrammer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public String toString() {
        return "FronEndProgrammer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
