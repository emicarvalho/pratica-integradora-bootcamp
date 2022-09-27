package aula03;

public interface Transacao {
    public abstract void transacaoOk(String tipoTransacao);
    public abstract void transacaoNaoOk(String tipoTransacao);
}
