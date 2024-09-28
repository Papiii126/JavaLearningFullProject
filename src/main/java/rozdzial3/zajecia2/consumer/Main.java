package rozdzial3.zajecia2.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // Normal java function
        Customer maria = new Customer("Maria", "99999");

        greetCustomer(maria);

        greetCustomerV2(maria, false);

        greetCustomerV2(maria, true);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);

        greetCustomerConsumerV2.accept(maria, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.getCustomerName() +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "*********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.getCustomerName() +
                    ", thanks for registering phone number "
                    + customer.getCustomerPhoneNumber());

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.getCustomerName() +
                ", thanks for registering phone number "
                + customer.getCustomerPhoneNumber());
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.getCustomerName() +
                ", thanks for registering phone number "
                + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "*********"));
    }
}
