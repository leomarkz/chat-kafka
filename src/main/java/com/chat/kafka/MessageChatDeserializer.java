package com.chat.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class MessageChatDeserializer implements Deserializer<MessageChat> {
    @Override public void close() {

    }

    @Override public void configure(Map<String, ?> arg0, boolean arg1) {

    }

    @Override
    public MessageChat deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        MessageChat messageChat = null;
        try {
            messageChat = mapper.readValue(arg1, MessageChat.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return messageChat;
    }

}
