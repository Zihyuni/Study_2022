package Iterator.GenericCollection;

import java.util.Collection;
import java.util.HashSet;

public class 일반반복자for문 {
    public static void main(String[] args) {
        Collection<String> stringCollection = new HashSet<String>();
        stringCollection.add("123");
        stringCollection.add("456");
        stringCollection.add("789");


        //향상 포문을 사용해서 읽어보자!!!!!
        for(String stringElement : stringCollection) {
            //do something with each stringElement
            System.out.println(stringElement);
        }
    }
}
