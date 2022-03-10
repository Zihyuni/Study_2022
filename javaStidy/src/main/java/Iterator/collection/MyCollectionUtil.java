package Iterator.collection;

import java.util.*;

public class MyCollectionUtil {

    public static void doSomething(Collection collection) {

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
            //do something to object here...

            Set set  = new HashSet();
            List list = new ArrayList();
            //set,list는 콜렉션임 그렇기 때문에 생성할때 이렇게 하면된다.


            MyCollectionUtil.doSomething(set);
            //MyCollectionutil의 doSometing의 set을 호출하겠다.
            MyCollectionUtil.doSomething(list);
            //MyCollectionutil의 doSometing의 list을 호출하겠다.



        }


    }
}