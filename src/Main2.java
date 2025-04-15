import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //List<Programmer> programmers = List.of(new Programmer("Petr", 20, 30000), new Programmer("Max", 4, 10000),
        //        new Programmer("Masha", 12, 16000));
        //List list = programmers;

//List <Programmer> programmers1 = new Manager<Programmer> (List.of(new Programmer("Petr", 20, 30000), new Programmer("Max", 4, 10000),
       // new Programmer("Masha", 12, 16000)));
List <Programmer> programmers = new ArrayList<>();
programmers.add(new Programmer("Petr", 20, 30000));
programmers.add(new Programmer("Max", 4, 20000));
programmers.add(new Programmer("Nina", 30, 15000));
Manager <Programmer> managers = new Manager<Programmer>(programmers);
managers.addWorkers(new Programmer ("Olga", 45, 700000));
        System.out.println(managers);
        List <QAEngineer> qaEngineers = new ArrayList<>();
        qaEngineers.add(new QAEngineer("Petr", 20, 30000));
        qaEngineers.add(new QAEngineer("Max", 4, 20000));
        qaEngineers.add(new QAEngineer("Nina", 30, 15000));
        Manager <QAEngineer> managers1 = new Manager <QAEngineer>(qaEngineers);
        managers1.addWorkers(new QAEngineer("Olga", 45, 700000));
        System.out.println(managers1);

        List <BackEndProgrammer> backEndProgrammers = new ArrayList<>();
        backEndProgrammers.add(new BackEndProgrammer("Petr", 20, 30000));
        backEndProgrammers.add(new BackEndProgrammer("Max", 4, 20000));
        backEndProgrammers.add(new BackEndProgrammer("Nina", 30, 15000));
        Manager <BackEndProgrammer> managers2 = new Manager <BackEndProgrammer>(backEndProgrammers);
        managers2.addWorkers(new BackEndProgrammer("Olga", 45, 700000));
        System.out.println(managers2);

    }
}
