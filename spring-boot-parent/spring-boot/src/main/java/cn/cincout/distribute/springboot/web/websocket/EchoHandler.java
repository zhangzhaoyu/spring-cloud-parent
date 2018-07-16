package cn.cincout.distribute.springboot.web.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

/**
 * Created by zhaoyu on 18-6-7.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
@Slf4j
public class EchoHandler implements WebSocketHandler {
    @Override
    public Mono<Void> handle(WebSocketSession webSocketSession) {
        return webSocketSession.send(webSocketSession.receive().map(
                msg -> webSocketSession.textMessage("ECHO -> " + msg.getPayloadAsText())
        ));
    }
}
