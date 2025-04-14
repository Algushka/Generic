import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //MyList<Programmer> list = new MyLinkedList<>();
        List<Programmer> programmers = List.of(new Programmer("Max", 18, 200000), new Programmer("Nina", 20, 500000),
                new Programmer("Max", 26, 600000));
        List<Programmer> list = programmers;
        List<String> list1 = List.of ("hjkj","hjkj","ghkjh","hjklj","ghghjhg");
        List<Integer> list2 = List.of (6,8,2,10,11,2);
        List <Integer> list3 = List.of(5,8,9,13,11,2);
        System.out.println("список общих элементов на одних и тех же позициях" +commonInTheList(list2,list3));

        System.out.println("Количество совпадений:");
        System.out.println(numberOfCoincidence(list2,2));
        Comparator<Programmer> comparator = new ComporatorByName();
        System.out.println("количество совпадений по имени : " + numberOfCoincidence(list,new Programmer("Max", 18, 50000), comparator  ));


    }


    public static <T extends Comparable<T>> int numberOfCoincidence(List <T> list, T element) {
        int result = 0;
        for (T value: list) {
            if (value.equals(element))
            {
                result++;

            }
        }
return result;
    }

    public static <T> int numberOfCoincidence(List <T> list, T element, Comparator<T> comparator) {
        int result = 0;
        for (T value: list) {
            if (comparator.compare(value, element)==0) {
                result++;
            }
        }
        return result;
    }
    /* находим общие элементы в листах и заносим их в другой список и возвращаем его*/
    public static <T extends Comparable <T>> List commonInTheList (List<T> list1, List<T> list2){

int sizeOfSmallerList=0;
List <T> newList = new ArrayList<T>() {
};
if (list1.size()>list2.size()) {sizeOfSmallerList=list2.size();}
 else sizeOfSmallerList=list1.size();
//for (T value:list1)
//}
        for (int i=0; i<sizeOfSmallerList; i++){
            if (list1.get(i).equals(list2.get(i))) {
               // newList.set(i,list1.get(i));?
newList.add(list2.get(i));
            }

        }
return newList;
    }
/* если несравнимые дописать */
    public static <T> List commonInTheList (List<T> list1, List<T> list2, Comparator <T> comparator){
        List result=null;
        int sizeOfSmallerList=0;
        List <T> newList = new ArrayList<T>() {
        };
        if (list1.size()>list2.size()) {sizeOfSmallerList=list2.size();}
        else sizeOfSmallerList=list1.size();
//for (T value:list1)
//}
        for (int i=0; i<sizeOfSmallerList; i++){
            if (list1.get(i).equals(list2.get(i))) {
                newList.set(i,list1.get(i));

            }

        }
        return result;
    }


}