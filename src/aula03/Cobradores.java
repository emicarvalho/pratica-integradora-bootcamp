package aula03;

public class Cobradores implements SaqueEmDinheiro, ConsultarSaldo {
    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void saqueEmDinheiro(double valorSaque) {
        System.out.println("Saque de R$:" + valorSaque);
    }

    @Override
    public void transacaoOk(String tipoTransacao) {
        System.out.println(tipoTransacao + "realizada com sucesso!");
    }

    @Override
    public void transacaoNaoOk(String tipoTransacao) {
        System.out.println("A transação" + tipoTransacao + " não pode ser concluída :/");
    }
}
