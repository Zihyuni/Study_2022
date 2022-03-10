package Iterator.foreach;

import java.util.ArrayList;
import java.util.List;

public class forEach이더레이블 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");


        //리스트를 담은 forEahc문을 element로 정한다..? 같음
        list.forEach( (element) -> {
            System.out.println( element );
            //출력한다 element를 그러면 element안에 값이 나온다.
        });
    }
}
