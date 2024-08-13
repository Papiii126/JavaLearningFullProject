package rozdzial2.zajecia10.daty.zadanie.turniej;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder

public class Turniej {
    private String nazwa;
    private double wpisowe;
    private LocalDate data;
    private int punkty;
    private int liczbaMiejscPunktowanych;
    private List<Gracz> graczList;


    public void rozdzielPunkty() {
        double punkty1 = this.punkty * 0.5;
        double punkty2 = this.punkty * 0.3;
        double punkty3 = this.punkty * 0.2;

        System.out.println("Punkty za 1. miejsce: " + punkty1);
        System.out.println("Punkty za 2. miejsce: " + punkty2);
        System.out.println("Punkty za 3. miejsce: " + punkty3);
    }

    public static Gracz najlepszyGraczZMiesiaca(List<Gracz> graczList, int miesiac, int rok) {
        Gracz najlepszyGracz = null;
        double maksymalnePunkty = Double.MIN_VALUE;

        for (Gracz gracz : graczList) {
            LocalDate dataUdzialu = gracz.getData();
            if (dataUdzialu.getMonthValue() == miesiac && dataUdzialu.getYear() == rok) {
                if (gracz.getPunkty() > maksymalnePunkty) {
                    maksymalnePunkty = gracz.getPunkty();
                    najlepszyGracz = gracz;
                }
            }
        }

        if (najlepszyGracz == null) {
            throw new IllegalArgumentException("Brak graczy z podanego miesiąca i roku");
        }

        return najlepszyGracz;
    }
}


