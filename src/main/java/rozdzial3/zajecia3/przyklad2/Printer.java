package rozdzial3.zajecia3.przyklad2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Printer<T> implements IPrint<T> {

    T object;

    @Override
    public void printInConsole(T arg) {
        System.out.println(arg);
    }
}
