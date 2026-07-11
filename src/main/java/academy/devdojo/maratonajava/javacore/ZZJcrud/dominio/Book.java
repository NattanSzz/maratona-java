package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Book {
    Integer id;
    String name;
    int chapters;
    Producer producer;
}
