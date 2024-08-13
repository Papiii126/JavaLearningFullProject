package rozdzial2.zajecia_dodatkowe3_enums;

public class Bird implements Animal {
    @Override
    public SizeType getSize() {
        return SizeType.SMALL;
    }

    @Override
    public String getType() {
        return "Bird";
    }

    @Override
    public void talk() {
        System.out.println("Ćwir Ćwir");
    }

    @Override
    public int getSumOfLegs() {
        return 2;
    }
}
