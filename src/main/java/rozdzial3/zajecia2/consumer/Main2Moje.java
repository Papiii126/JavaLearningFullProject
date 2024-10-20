package rozdzial3.zajecia2.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main2Moje {
    public static void main(String[] args) {
        // normalna funkcja javy
        Customer c1 = new Customer("Bartosz", "781252369");

        greetCustomer(c1);

        greetCustomer2(c1, false);

        greetCustomer2(c1, true);

        // Consumer Functional Interface
        System.out.println("---------");

        greetCustomerConsumer.accept(c1);

        greetCustomerBiConsumer.accept(c1, false);

        greetCustomerBiConsumer.accept(c1, true);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.getCustomerName() + ", " +
                "your phone number is: "
                + customer.getCustomerPhoneNumber());
    }

    static void greetCustomer2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.getCustomerName() + ", " +
                "your phone number is: "
                + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "Brak numeru telefonu"));
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.getCustomerName() + ", " +
                    "your phone number is: "
                    + customer.getCustomerPhoneNumber());

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.getCustomerName() + ", " +
                    "your phone number is: "
                    + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "Brak numeru telefonu"));

}
