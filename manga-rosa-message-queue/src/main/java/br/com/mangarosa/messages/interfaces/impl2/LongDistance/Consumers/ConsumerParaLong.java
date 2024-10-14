package br.com.mangarosa.messages.interfaces.impl2.LongDistance.Consumers;

import br.com.mangarosa.messages.Message;
import br.com.mangarosa.messages.interfaces.Consumer;

public class ConsumerParaLong implements Consumer {

    /***
     * Declarando a variável nome
     */

    private final String nome;

    /***
     * Inicializando o nome do consumer
     * @param nome
     */
    public ConsumerParaLong(String nome) {
        this.nome = "ConsumerParaLongDistance";
    }

    /***
     * Consumindo a mensagem recebida
     * @param message mensagem para ser consumida
     * @return
     */
    @Override
    public boolean consume(Message message) {
        System.out.println("Consumindo mensagem... " + message.getMessage());
        return true;
    }

    /***
     * Retornando o  do consumer
     * @return
     */
    @Override
    public String name() {
        return(nome);
    }
}
