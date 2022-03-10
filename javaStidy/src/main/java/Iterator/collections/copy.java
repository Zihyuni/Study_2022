package Iterator.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class copy {

    public static void main(String[] args) {
        List<String> source = new ArrayList<>();
        Collections.addAll(source,"e1","e2","e3");
        //source라는 리스트에 모두 담았습니다~~!

        List<String> destination = new ArrayList(source);
        //이거 그냥 ()안에 아무것도 안쓰고 돌리면 에러난ㄷ
        //이유는 source랑 destination의 사이즈가 안맞아서이다.그래서 파라미터로 넘겨야한다.
        Collections.copy(destination,source);
        //destination안에 source를 복사해서 담는다..!!

        Iterator iterator = destination.iterator() ;
        while (iterator.hasNext()){
            Object copyObj = iterator.next();
            System.out.println(copyObj);
        }

    }

}
