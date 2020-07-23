package com.chat.kafka;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageConsumer {

    @Incoming("send-message")
    public void sendMessage(MessageChat message) {
        // fazer requisição http para o cliente
        System.out.println(message.getText());
    }
}
