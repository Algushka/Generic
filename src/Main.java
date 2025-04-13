import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //MyList<Programmer> list = new MyLinkedList<>();
        List<Programmer> programmers = List.of(new Programmer("Jack", 18, 200000), new Programmer("Max", 20, 500000),
                new Programmer("Max", 26, 600000));
        List<Programmer> list = programmers;
        List<String> list1 = List.of ("hjkj","hjkj","ghkjh","hjklj")
        numberOfCoinsidance(list1, "ghghjhg");

    }


    public static <T extends Comparable<T>> int numberOfCoinsidance(List <T> list, T element) {
        int result = 0;
        for (T value: list) {
            if (value.compareTo(element)>0)
                result++;
        }
return result;
    }
}