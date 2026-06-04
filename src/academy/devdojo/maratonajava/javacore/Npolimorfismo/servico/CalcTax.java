package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Mobile;

public class CalcTax {
    public static void calcTaxComputer(Computer computer) {
        System.out.println("Relatorio de imposto do computador");
        double tax = computer.calcTax();
        System.out.println("Computador " + computer.getName());
        System.out.println("Valor " + computer.getValue());
        System.out.println("Imposto a ser pago " + tax);
        System.out.println("------------------------------------");
    }

    public static void calcTaxMobile(Mobile mobile) {
        System.out.println("Relatorio de imposto do celular");
        double tax = mobile.calcTax();
        System.out.println("Celular " + mobile.getName());
        System.out.println("Valor " + mobile.getValue());
        System.out.println("Imposto a ser pago " + tax);
        System.out.println("------------------------------------");
    }
}
