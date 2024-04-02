package org.selsup.crptapi.service;

import lombok.Data;
import org.selsup.crptapi.domain.dto.crpt_api.DocumentDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Data
@Service
public class CrptApiService {
    @Value("${crpt-api.create-url}")
    private String crptCreateUrl;
    private final WebClient webClient;

    public Mono<DocumentDto> requestCreateDocument(DocumentDto dto) {
        return webClient
                .post()
                .uri(crptCreateUrl)
                .body(Mono.just(dto), DocumentDto.class)
                .retrieve()
                .bodyToMono(DocumentDto.class)
                .onErrorResume(error -> Mono.error(new RuntimeException(error.getMessage(), error.getCause())));
    }
}
