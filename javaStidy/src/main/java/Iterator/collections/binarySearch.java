package Iterator.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class binarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        //리스트에 값들을 추가하고.

        Collections.sort(list);

        int index = Collections.binarySearch(list, "four");
        //인덱스에 객체를 담아준다 (리스트에 "four"라는 객체가있는지.

        System.out.println(index);
        //1을 반환해준다 1개의 객체가 있기 떄문에

        //그렇다면 객체를 하나 더 추가헤서 두개를 만들어보면?

        list.add("four");

        //처음에 이렇게만하고
        //아래 Collections.sort(list)를 안적고 index2를 출력했더니 1만 나왔다
        //무조건 Collections.sort를 해줘야하는거 같다!
        //약간의 커밋같은거 같기도하고.. 또 한번 수동으로 반영시켜줘야하는거 같다.
        Collections.sort(list);
        int index2 = Collections.binarySearch(list,"four");
        System.out.println("이건 index2야"+index2);
        //똑같이 하나가 나온다..? 아니면 중복은 추가가 안되나?

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
