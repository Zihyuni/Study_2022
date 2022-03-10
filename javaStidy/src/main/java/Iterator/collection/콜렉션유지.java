package Iterator.collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class 콜렉션유지 {

    public static void main(String[] args) {

        Collection colA = new ArrayList();
        Collection colB = new ArrayList();

        colA.add("A");
        colA.add("B");
        colA.add("C");

        colB.add("1");
        colB.add("2");
        colB.add("3");

        Collection target = new HashSet();

        target.addAll(colA);
        //타겟이라는 컬렉션안에다가 colA 컬렉션을 넣어버림 A,B,C
        target.addAll(colB);
        //타겟이라는 컬렉션안에다가 colB 컬렉션을 넣어버림 1,2,3
        target.retainAll(colB);
        //retainAll은  먼저 담은 객체를 없애버리고 다음 객체만 담는거
        /*
        위 코드가 원래같으면 colA갇 들어간 상태라 A,B,C가있고
        그 뒤에 1,2,3이 들어가야하는데
        retainAll을 하면 먼저들어가있던 A,B,C가 초기화되고 1,2,3이 들어가는거
         */

    }
}
