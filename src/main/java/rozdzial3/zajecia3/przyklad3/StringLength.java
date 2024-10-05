package rozdzial3.zajecia3.przyklad3;

public class StringLength implements Func<String, Integer>{

    @Override
    public Integer method(String s) {
        return s.length();
    }
}
