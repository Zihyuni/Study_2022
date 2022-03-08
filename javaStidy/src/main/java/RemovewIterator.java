import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovewIterator {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        //배열리스트 선언!!


        list.add("123");
        list.add("456");
        list.add("789");
        //배열에 담겠음!!!

        Iterator<String> iterator = list.iterator();
        System.out.println(list.getClass().getName());
        System.out.println(iterator.getClass().getName());
        while (iterator.hasNext()) {
            String value = iterator.next();

            if (value.equals("456")) {
                //리무브를 해보겠
                iterator.remove();
                //이거 홈페이지에서는 iterator로 적혀있는데 실제론 list로 적어야하였음

                //과연 삭제가 되었나요???
                System.out.println("삭제");


            }


            //System.out.println("삭제되었을까?" + iterator.toString());
            //이거도 iteraotr.next출력이 아닌 list로 봐야함
            //왜냐면 전체적인 list에서 삭제했는지 아닌지를 봐야하니까.
        }

        System.out.println(list);

    }
}