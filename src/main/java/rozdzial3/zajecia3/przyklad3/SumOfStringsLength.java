package rozdzial3.zajecia3.przyklad3;

import java.util.List;

public class SumOfStringsLength implements Func<List<String>, Integer>{

    @Override
    public Integer method(List<String> strings) {
        return strings.stream().mapToInt(String::length).sum();
    }
}
