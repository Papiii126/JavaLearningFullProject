package rozdzial2.zajecia12.bankowy;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import java.math.BigDecimal;
@Data
@Builder
@ToString
public class Konto {
    private String numerKonta;
    private BigDecimal saldo;
    private Currency currency;
    private Klient klient;

    //TODO ogarnac && oraz || logiczny
    public void deposit(BigDecimal kwota) throws WrongAmountException {
        if (kwota == null || kwota.compareTo(BigDecimal.ZERO) <= 0) {
            throw new WrongAmountException("Niepoprawna kwota.");
        } else {
            saldo = saldo.add(kwota);
            System.out.println("Wpłacono: " + kwota + " " + currency + ". Aktualne saldo wynosi: " + saldo + " " + currency);
        }
    }

    public void withdraw(BigDecimal kwota) throws UnvailableFundsException {
        if (kwota == null || kwota.compareTo(BigDecimal.ZERO) <= 0 || saldo.compareTo(kwota) < 0) {
            throw new UnvailableFundsException("Brak wystarczających środków na koncie!!!");
        } else {
            saldo = saldo.subtract(kwota);
            System.out.println("Wypłacono: " + kwota + " " + currency + ". Aktualne saldo wynosi: " + saldo + " " + currency);
        }
    }
    public void chargeInterest() {
        BigDecimal saldoPrzedOdsetkami = saldo;
        BigDecimal odsetki;
        if (saldo.compareTo(BigDecimal.ZERO) < 0) {
            odsetki = new BigDecimal("0.05");
            saldo = saldo.add(saldo.multiply(odsetki));
        } else if (saldo.compareTo(new BigDecimal("10000")) > 0) {
            odsetki = new BigDecimal("0.02");
            saldo = saldo.add(saldo.multiply(odsetki));
        }
        BigDecimal saldoPoOdsetkach = saldo;
        BigDecimal kwotaOdsetek = saldoPoOdsetkach.subtract(saldoPrzedOdsetkami);
        System.out.println("Saldo z odsetkami konta " + getNumerKonta() + " wynosi " + saldo + " " + getCurrency());
        System.out.println("Kwota odsetek: " + kwotaOdsetek + " " + getCurrency());
    }

    public void displayAccountInfo(String tlumaczenie) throws WrongTranslationException {
        if (tlumaczenie != null && tlumaczenie.equalsIgnoreCase("Polski")) {
            System.out.println("Numer konta: " + getNumerKonta() + "\nSaldo: " + saldo + "\nWaluta: " + currency.polski);
        } else if (tlumaczenie.equalsIgnoreCase("Angielski")) {
            System.out.println("Numer konta: " + getNumerKonta() + "\nSaldo: " + saldo + "\nWaluta: " + currency.angielski);
        } else {
            throw new WrongTranslationException("Wybierz z opcji: polski / angielski");
        }
    }
}


