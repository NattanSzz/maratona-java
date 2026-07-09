package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.ReportDto;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRASIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = new Person.PersonBuilder()
            .firstName("Willian")
            .lastName("Suane")
            .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
            .aircraftName(aircraft.getName())
            .country(country)
            .currency(currency)
            .personName(person.getFirstName() + " " + person.getLastName())
            .build();

        System.out.println(reportDto);
    }
}
