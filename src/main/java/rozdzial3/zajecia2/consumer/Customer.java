package rozdzial3.zajecia2.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private final String customerName;
    private final String customerPhoneNumber;

}
