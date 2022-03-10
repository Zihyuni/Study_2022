package Iterator.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 이더레이터 {

    /*
    for-each 루프로 iterable반복
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("하나아");
        list.add("두울");
        list.add("세엣");

        for( String element : list ){
            System.out.println( element.toString());
        }


        //ㅇ거는 원래 리스트에서 이더레이터 쓴거임..!!
        //이렇게 두개를 통해서 iterable 반복
//
//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println( element );
//            }
    }




}
