package aula02;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        divisao(a,b);
    }
    public static void divisao(int a, int b) throws IllegalArgumentException {
        try {
            System.out.println(a/b);
        } catch (ArithmeticException exception) {
//             System.out.println("Parte A:");
//             System.out.println("Ocoreu um erro!!");

             System.out.println("Parte B:");
             throw new IllegalArgumentException("Não pode dividir por zero!");
        } finally {
            System.out.println("Programa finalizado!");
        }
    }
}
