package academy.devdojo.maratonajava.javacore.Hheranca.test;

// import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Worker;

public abstract class HerancaTest02 {
    // 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carrega-la.
    // 1 - Bloco de inicialização estatico da sub classe é executado quando a JVM carrega-la.
    // 2 - Alocado espaço em memoria para o objeto da super classe.
    // 3 - Cada atributo de super classe é criado e inicializado com default values ou o que for passado.
    // 4 - Bloco de inicialização da super classe é executado em ordem.
    // 5 - Construtor da super classe é executado.
    // 6 - Alocado espaço em memoria para o objeto da sub classe.
    // 7 - Cada atributo de sub classe é criado e inicializado com default values ou o que for passado.
    // 8 - Bloco de inicialização da sub classe é executado em ordem.
    // 9 - Construtor da sub classe é executado.sub
    public static void main(String[] args) {
        // Worker worker = new Worker("Bob Esponja");
    }
}
