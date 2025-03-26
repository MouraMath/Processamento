package dev.processamento.consumer;


import dev.processamento.dto.PedidoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProcessamentoConsumer {

    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listerProcessamentoQueue(PedidoDTO pedidoDTO){
        System.out.println(pedidoDTO.getDescricao());
    }

}
