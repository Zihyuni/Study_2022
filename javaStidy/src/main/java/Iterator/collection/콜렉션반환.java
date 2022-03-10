package Iterator.collection;

import java.util.Collection;
import java.util.HashSet;

public class 콜렉션반환 {

    public static void main(String[] args) {



        Collection collection = new HashSet();

        String elements = "an element";
        collection.add("an element");

        boolean containsElement = collection.contains("an element");
        System.out.println(containsElement);

        //만약에 컬렉션 요소가 포함 되어있으면 true를 반환하고
        //아니면 false를 반환한다.

       // boolean containsAll = collection.containsAll(elements);
        //위에꺼 코드 빨간줄 가는데 이유를 알아봐야함.
        //매개변수 컬렉션의 모든 요소가 포함되면 true 아니면 false

        int numberOfElements = collection.size();
        //변수에 컬렉션의 사이즈를 담아준다
        System.out.println(numberOfElements);
        //출력해보면 컬렉션의 사이즈가 나타난다!!


    }
}
