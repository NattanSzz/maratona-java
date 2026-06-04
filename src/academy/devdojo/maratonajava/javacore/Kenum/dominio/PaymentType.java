package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum PaymentType {
    DEBITO {

        @Override
        public double calcDiscout(double value) {
            return value * 0.1;
        }
        
    }, CREDITO {

        @Override
        public double calcDiscout(double value) {
            return value * 0.05;
        }
        
    };

    public abstract double calcDiscout(double value);
}