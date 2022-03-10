package Iterator.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class 컬렉션반복 {
    public static void main(String[] args) {
        Collection collection = new HashSet();

        //Iterator를 사용해서 하면 된다!!
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }

}
