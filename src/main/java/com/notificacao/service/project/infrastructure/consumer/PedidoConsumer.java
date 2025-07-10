package com.notificacao.service.project.infrastructure.consumer;


import com.notificacao.service.project.domain.Pedido;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsumer {
    @KafkaListener(topics = "novos-pedidos", groupId = "grupo-notificacao", containerFactory = "pedidoListenerContainerFactory")
    public void consumir(Pedido pedido) {
        System.out.println("📩 Nova notificação de pedido recebido:");
        System.out.println("➡️ ID: " + pedido.getId());
        System.out.println("➡️ Cliente: " + pedido.getCliente());
        System.out.println("➡️ Valor: R$ " + pedido.getValor());
    }
}
