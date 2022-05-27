public interface InterfConta {

    void retirar (double valor);

    void depositar (double valor);

    void transferir (double valor, Conta contaDestino);

    void imprimirExtrato();

}
