import java.util.*;

public class JavaIterator {

    //Iterator은 함수임!!!

    /*
     hasNext() : 아마 반복되는 요소가 더 많으면 true를 반환하고 그렇지않으면 false를 반환한다는 거같음.
     next() : iterator에서 다음 요소를 반환함.
     remove() : 반복하는 컬렉션에서 next에서 반환하는 최신 요소를 제거한다함.
     forEachRemaining() : 나머지 요소를 반복하고 나머지 각요소를 람다식에 대한 매개변수로 전달하는람다식을 호출
     */

    //컬렉션 프레임워크 :::: List,Set  Map,Quene을 말하며
    //프레임웤 생성한 후에
    //iterator<데이터타입>iterator명 = 컬렉션.iterator();이런식으로 사용하면 됨.

    //생성해보자!!!

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        //리스트에 내용 추가했음!

        Iterator<String> iterator = list.iterator();
        //Interator 생성자 만들기.

        System.out.println("출력해보겠습니다::::"+iterator);

        Set<String> set = new HashSet<>();
        //셋 생성

        set.add("1");
        set.add("2");
        set.add("3");
        //셋에 추가함 내용들

        Iterator<String> iterator2 = set.iterator();
        System.out.println("출력해볼게요 iterator2::::"+iterator2);




        while(iterator.hasNext()){
            Object nextObject = iterator.next();
            Object hasNextObject = iterator.hasNext();
            //객체형 nextObject에 itrator.next()를 담는다. 담긴 객체들을 반환하는 것인거같음
            System.out.println("while문 메소드입니다 출력할게요 ::"+nextObject);
            //순서대로 출력이 잘되었다.

            System.out.print("while에서 true일까요? false일까요?"+hasNextObject);
            //이거는 맨마지막꺼 빼고 다 true고 맨마직은 false임
            //이유는 마지막꺼는 다음에 반환해줄게 없기떄문임!!!
        }


    }






}