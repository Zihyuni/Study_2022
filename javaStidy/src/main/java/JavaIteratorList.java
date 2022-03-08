import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class JavaIteratorList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("123");
        list.add("456");
        list.add("789");

        Iterator<String> iterator = list.iterator();




        while (iterator.hasNext()) {
            String value = iterator.next();

            //이거 iterator.next가 456이 되면 list.add(999)하란거데
            //이거하면 오류남1!! 왜냐하면
            //반복문 도는 중간에 하면 오류난다함!!
            if (value.equals("456")) {
                list.add("999");

                break;

            }
            System.out.println(value);

        }
    }
}
