package rozdzial3.zajecia3.przyklad3;

import java.util.List;
import java.util.NoSuchElementException;

public class ListOfIntsMaxElement implements Func<List<Integer>, Integer>{

    @Override
    public Integer method(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).max().orElseThrow(NoSuchElementException::new);
    }
}
