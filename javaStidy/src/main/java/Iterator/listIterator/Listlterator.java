package Iterator.listIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listlterator {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hannah");

        ListIterator<String> listIterator = list.listIterator();

        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
            System.out.println("=========================");
        }

        while(listIterator.hasPrevious()) {
            //요소를 앞뒤로 탐색할 수 있다.

            //어떤뜻이냐면 뒤집어서 출력이 가능하다고 말할 수 있다.
            /*
            1
            2
            3
            이면
            3
            2
            1
            이런식으로 출력해준다.
             */
            System.out.println(listIterator.previous());
            System.out.println("2====================22");
        }
    }
}
