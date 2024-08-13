package rozdzial2.zajecia7.trzeci;

public class Spodnie {
    String Material;
    RozmiarSpodni rozmiarSpodni;

    public Spodnie(String material, RozmiarSpodni rozmiarSpodni) {
        Material = material;
        this.rozmiarSpodni = rozmiarSpodni;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public RozmiarSpodni getRozmiarSpodni() {
        return rozmiarSpodni;
    }

    public void setRozmiarSpodni(RozmiarSpodni rozmiarSpodni) {
        this.rozmiarSpodni = rozmiarSpodni;
    }

    @Override
    public String toString() {
        return "Spodnie{" +
                "Material='" + Material + '\'' +
                ", rozmiarSpodni=" + rozmiarSpodni +
                '}';
    }
}
