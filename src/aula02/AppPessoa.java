package aula02;

public class AppPessoa extends Pessoa {
    public static void main(String[] args) {
        double resultIMC;
        boolean resultEhMaior;

        Pessoa pessoa1 =  new Pessoa();
        Pessoa pessoa2 =  new Pessoa("Maria", 25, "1A2B3B45S");
        Pessoa pessoa3 =  new Pessoa("Joana", 45, "fdfds15613", 664, 1.63);
        resultIMC = pessoa3.calcularIMC();

            if (resultIMC == 1) {
                System.out.println("Sobrepeso");
            } else if(resultIMC == -1) {
                System.out.println("Abaixo do peso!");
            } else if (resultIMC == 0) {
                System.out.println("Peso saudável");
            }

            resultEhMaior = pessoa3.ehMaiorIdade();

            if (resultEhMaior) {
                System.out.println("É MAIOR DE IDADE!");
            } else {
                System.out.println("NÀO É MAIOR DE IDADE!");
            }
    }
}
