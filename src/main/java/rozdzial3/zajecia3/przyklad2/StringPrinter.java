package rozdzial3.zajecia3.przyklad2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StringPrinter {
    private String word;

    public void printWord(){
        System.out.println(word);
    }
}
