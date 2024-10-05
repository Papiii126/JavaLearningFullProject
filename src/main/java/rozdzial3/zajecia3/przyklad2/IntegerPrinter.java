package rozdzial3.zajecia3.przyklad2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IntegerPrinter {
    private int number;

    public void printNumber(){
        System.out.println(number);
    }
}
