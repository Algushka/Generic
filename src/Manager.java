import java.util.List;

public class Manager <T> {
private List<T> listOfWorkers;

    public Manager(List<T> listOfWorkers) {
        this.listOfWorkers = listOfWorkers;
    }
    public List<T> addWorkers(T worker){
        listOfWorkers.add(worker);
        return listOfWorkers;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "listOfWorkers=" + listOfWorkers +
                '}';
    }
}
