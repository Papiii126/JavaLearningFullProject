package rozdzial2.zajecia12.bankowy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws WrongTranslationException, NullIsForbiddenException, WrongAmountException, UnvailableFundsException {
        // Stworz krotki system bankowy oparty na klasie BigDecimal. Stworz klase Klient
        // i Konto. Klient moze miec wiele kont. Konto powinno miec metody
        // deposit(BigDecimal b) i withdraw(BigDecimal b). Przeprowadz symulacje
        // wplacania i wyplacania pieniedzy.
        // Dodaj swoje metody pozwalajace na ciekawe operacje na koncie np naliczenie
        // odsetek gdy stan konta jest ujemny, dodanie odsetek gdy ktos ma duzo
        // pieniedzy itp

        Klient klient1 = new Klient("Tomasz", "Galon");

        Konto konto1 = Konto.builder()
                .numerKonta("12141896215585632")
                .saldo(BigDecimal.valueOf(100000))
                .currency(Currency.PLN)
                .build();

        Konto konto2 = Konto.builder()
                .numerKonta("12141896215585628")
                .saldo(BigDecimal.valueOf(56000))
                .currency(Currency.GBP)
                .build();


        konto1.displayAccountInfo("polski");
//        System.out.println("-------");
//        konto2.displayAccountInfo("polski");
//        System.out.println("--------");
//
//        klient1.addAccount(konto1);
        //       klient1.addAccount(konto2);
//
//        System.out.println("------");
//        konto1.deposit(BigDecimal.valueOf(5000));
        //   konto2.withdraw(BigDecimal.valueOf(-500));
//        System.out.println("-------");
//        konto1.chargeInterest();
//        System.out.println("------");
//        konto2.chargeInterest();
    }
}



