package com.development.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

	
	private String content; // This represents the Message
	
	private String sender;  // The Sender is the person who sends the Message to the receiver
	
	private MessageType type;

	  public ChatMessage(String content, String sender, MessageType type) {
	        this.content = content;
	        this.sender = sender;
	        this.type = type;
	    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	// Builder pattern implementation
    public static ChatMessageBuilder builder() {
        return new ChatMessageBuilder();
    }

    // Static inner Builder class
    public static class ChatMessageBuilder {
        private String content;
        private String sender;
        private MessageType type;

        public ChatMessageBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ChatMessageBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public ChatMessageBuilder type(MessageType type) {
            this.type = type;
            return this;
        }

        public ChatMessage build() {
            return new ChatMessage(content, sender, type);
        }
	
    }
}
