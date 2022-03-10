package Iterator.listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Interface<T> implements Iterator<T> {

    private List<T> source = null;
    private int index = 0;

    public Interface(List<T> source) {
        this.source = source;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.source.size();
    //has메소드가 어떻게 구현되는지 적은 거임
    }

    @Override
    public T next() {
        return this.source.get(this.index++);

        //이건 next가 어떻게 구현되는지 적은 메소드
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

//        Interface<String> iterator = new ListIterator<String>(list);
//        while(iterator.hasNext()) {
//            System.out.println( iterator.next() );
        }

    }

