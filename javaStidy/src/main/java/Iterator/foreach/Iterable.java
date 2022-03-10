package Iterator.foreach;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface Iterable<T> {

    Iterator<T> iterator();

    Spliterator<T> spliterator();

    //처리할 element가 있으면 true반환 없으면 false
    void forEach(Consumer<? super T> action);
    //모든 요소가 처리되거나 작업이 예외를 throw할 때까지
    // Iterable 의 각 요소에 대해 주어진 작업을 수행


}