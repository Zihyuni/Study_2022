package Iterator.listIterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSetIterator {

    public static void main(String[] args) {

        Set set = new HashSet();

        set.add("set123입니다.");
        set.add("set456입니다.");
        set.add("set789입니다.");
    //set에다가 추가했습니다..!!!!
        Iterator iterator = set.iterator();


        while(iterator.hasNext()){
            Object nextSetObject = iterator.next();

            System.out.println(nextSetObject);
        }
    }
}
