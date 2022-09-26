package aula02;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 =  new Pessoa();
        Pessoa pessoa2 =  new Pessoa("Maria", 25, "1A2B3B45S");
        Pessoa pessoa3 =  new Pessoa("Joana", 45, "fdfds15613", 64, 164);

        pessoa3.calcularIMC();
    }
}
