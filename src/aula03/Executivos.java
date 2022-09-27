package aula03;

public class Executivos implements Deposito, Transferencia  {

    @Override
    public void deposito(double valor) {
        System.out.println("Fazendo depósito de R$" + valor);
    }

    @Override
    public void transacaoOk(String tipoTransacao) {
        System.out.println(tipoTransacao + "realizada com sucesso!");
    }

    @Override
    public void transacaoNaoOk(String tipoTransacao) {
        System.out.println("A transação" + tipoTransacao + " não pode ser concluída :/");
    }

    @Override
    public void transferencia(double valor) {
        System.out.println("Fazendo transferência de R$" + valor);
    }
}
