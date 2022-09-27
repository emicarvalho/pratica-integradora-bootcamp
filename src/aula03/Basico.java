package aula03;

public class Basico implements ConsultarSaldo, PagamentoServicos, SaqueEmDinheiro {
    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void pagamentoServicos(String tipo) {
        System.out.println("Pagando serviço:" + tipo);
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
