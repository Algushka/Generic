import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
//Задача 1
//
//Написать generic метод, который считает, сколько раз заданный объект встречается в данном листе.
//Ваш метод должен работать с листом любого типа
//
//Задача 2
//
//        Написать метод, получает два List одного и того же типа и возвращает List из элементов,
//которые присутствуют и в том и в том листе на одинаковых позициях
//
//Например {1,4,6,7} {1,2,6} -> {1,6} или
//{“jack”,”nick”}, {“jack”,”nick”,”ann”} -> {“jack”,”nick”}



/* https://github.com/Algushka/Generic.git   */
public class Main {
    public static void main(String[] args) {
        //MyList<Programmer> list = new MyLinkedList<>();
        List<Programmer> programmers = List.of(new Programmer("Max", 18, 200000), new Programmer("Nina", 20, 500000),
                new Programmer("Max", 22, 26000));
        List <Programmer> programmers1 = List.of(new Programmer("Max", 20, 200000), new Programmer("Mark", 20, 500000),
                new Programmer("Nina", 34, 150000));
        List<Programmer> list4 = programmers;
        List<Programmer> list5 = programmers1;
        List<String> list1 = List.of ("hjkj","hjkj","ghkjh","hjklj","ghghjhg");
        List<Integer> list2 = List.of (6,8,2,10,11,2);
        List <Integer> list3 = List.of(5,8,9,13,11,2);
        System.out.println("список общих элементов на одних и тех же позициях" +commonInTheList(list2,list3));
        System.out.println("Список общих элементов по имени и на тех же позициях" + commonInTheList(list4, list5, new ComporatorByName() {
            @Override
            public int compare(Programmer o1, Programmer o2) {
                return 0;
            }
        }));
        System.out.println("Количество совпадений:");
        System.out.println(numberOfCoincidence(list2,2));
        Comparator<Programmer> comparator = new ComporatorByName();
        System.out.println("количество совпадений по имени : " + numberOfCoincidence(list4,new Programmer("Max", 18, 50000), comparator  ));


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
        int count=0;
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
newList.add(list1.get(i));

            }

        }
return newList;
    }
/* если несравнимые дописать */
    public static <T> List commonInTheList (List<T> list1, List<T> list2, Comparator <T> comparator){
        List result=null;
        int count =0;
        int sizeOfSmallerList=0;
        List <T> newList = new ArrayList <T> () ;

        if (list1.size()>list2.size()) {sizeOfSmallerList=list2.size();}
        else sizeOfSmallerList=list1.size();

        for (int i=0; i<sizeOfSmallerList; i++){
            if (comparator.compare (list1.get(i), list2.get(i))==0)
            {
                System.out.println("ура!!!"+ list1.get(i));
                newList.add(list1.get(i)); count++;   /*почему не добавляет???????*/

            }
        }
        return result;
    }


}