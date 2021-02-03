package com.externalqueueconsumer.demo.Consumer;

import com.externalqueueconsumer.demo.Dto.EmailDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "EMAILQUEUE")
    public  void consumeEmailFromQueue(EmailDto request){
        System.out.println("Received From Email Queue " + request);
    }
}
