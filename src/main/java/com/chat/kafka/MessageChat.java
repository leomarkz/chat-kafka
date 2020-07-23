package com.chat.kafka;

import javax.validation.constraints.NotEmpty;

public class MessageChat {
    @NotEmpty
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
