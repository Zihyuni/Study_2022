package Iterator.GenericCollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class 일반반복자 {
    public static void main(String[] args) {

        //일반 스트링 컬렉션
        Collection<String> stringCollection = new HashSet<String>();

        //이더레이터 안에는 스트링 형식의 콜렉션만 들어올 수 있음.
        Iterator<String> iterator = stringCollection.iterator();

    }
}
