package Iterator.GenericCollection;

import java.util.Collection;
import java.util.HashSet;

public class 일반컬렉션 {

    public static void main(String[] args) {
        Collection<String> stringCollection = new HashSet<String>();
        /*
        제네릭은 <>안에 들어간거만 받겠다는 건데
        컬렉션은 String 인스턴스만 받을 수 있다.
        혹여나 다른 유형을 추가하게되면 컴파일러 에러가 존재한다함.
         */

        //stringCollection.add(213);
        //주석풀고 보면 바로 여기서부터 에러가난다.
    }
}
