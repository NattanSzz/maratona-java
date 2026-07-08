package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

public class Discount {
    public enum Code {
        NONE(0), SUPER_SAYAJIN(5), SUPER_SAYAJIN2(10), SUPER_SAYAJIN3(15);
        private final int PERCENTAGE;

        Code(int percentage) {
            this.PERCENTAGE = percentage;
        }

        public int getPercentage() {
            return PERCENTAGE;
        }
    }
}
