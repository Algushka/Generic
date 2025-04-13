import java.util.Arrays;

public class MyArrayList <T> implements MyList<T>{
private Object [] elements= new Object[5];
private int size=0;



    @Override
    public void add(T element) {
if (size>=elements.length) {enlarge();}
elements[size]=element;
size++;


    }
    private void enlarge(){
        if (size>elements.length) {
            Object[] copyOfElements= Arrays.copyOf(elements,elements.length*2)
            elements=copyOfElements;

        }

    }

    @Override
    public int size() {
        return 0;
    }


}
