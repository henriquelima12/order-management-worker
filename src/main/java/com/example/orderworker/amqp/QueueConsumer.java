package com.example.orderworker.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

    @RabbitListener(queues = {"order-request-queue"})
    public void receive(@Payload String fileBody) {
        System.out.println("Pedido: " +fileBody);
    }

}