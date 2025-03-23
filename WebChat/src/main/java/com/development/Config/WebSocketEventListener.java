package com.development.Config;

import org.springframework.context.event.EventListener;

import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;
import com.development.controller.ChatMessage;
import com.development.controller.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class WebSocketEventListener {
        
	 private final SimpMessageSendingOperations messagingTemplate = null;
	   
	@EventListener
	public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
		  StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
	        String username = (String) headerAccessor.getSessionAttributes().get("username");
	        if (username != null) {
	        	System.out.println("User disconnected: " + username);
	            var chatMessage = ChatMessage.builder()
	                    .type(MessageType.LEAVE)
	                    .sender(username)
	                    .build();
	            messagingTemplate.convertAndSend("/topic/public", chatMessage);
	        }
	}
}
// SLF4J is the Simple Logging Facade For the java .. 
//Its a Logging Framework  that Acts As a Abstraction Layer
