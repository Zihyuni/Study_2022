package Iterator.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 콜렉션요소추가와삭제 {

    public static void main(String[] args) {
        Collection collection = new HashSet();
        //HashSet으로 생성한 것임
//        String anElement = "an element";
//        //내용을 추가할 문자열을 변수에 담아준다
//
//        boolean didCollectionChange = collection.add(anElement);
//        //수정한컬렉션을 담은 객체를 생성?..하는듯
//
//        Iterator iterator = collection.iterator();
//        while (iterator.hasNext()){
//            Object nexObj = iterator.next();
//            System.out.println("이건 첫번째 객체추가해서 바뀐거:"+nexObj);
//        }
//        //한번 확인해보라 didCollectionChange를 호출하면 뭐가 나오는지
//
//        boolean wasElementRemoved = collection.remove(anElement);
        //삭제해준다 anElement를

        //컬렉션을 사용해서 자바 객체를 추가할 수도 있다.
        Set set01 = new HashSet();
        set01.add("abc");
        set01.add("def");
        //두개의 요소만 추가해봤음.

        Collection  col01 = new HashSet<>();
        collection.addAll(set01);

        Iterator iterator2 = collection.iterator();
        //이더레이터로 안에 검사해보기
        while (iterator2.hasNext()){
            Object newObj = iterator2.next();
            System.out.println("자바객체를 담아버린 컬렉션"+newObj);
        }
        //두개들어있던 자바객체가 넣어짐


    }
}
