package rozdzial2.zajecia7.dzialania;

public enum Dzialania {

    DODAWANIE {
        public double licz(double x, double y) {
            return x + y;
        }
    },
    ODEJMOWANIE {
        public double licz(double x, double y) {
            return x - y;
        }
    },
    MNOZENE {
        public double licz(double x, double y) {
            return x * y;
        }
    },
    DZIELENIE {
        public double licz(double x, double y) {
            return x / y;
        }
    };


    public abstract double licz(double x, double y);
}