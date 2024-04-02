package org.selsup.crptapi.rest.crpt_api;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.selsup.crptapi.domain.dto.crpt_api.DocumentDto;
import org.selsup.crptapi.service.CrptApiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Data
@RequiredArgsConstructor
@RestController
@RequestMapping(("/api/v1/crpt/document/create"))
public class CrptApiRestControllerV1 {
    private final CrptApiService crptApiService;

    @PostMapping
    public Mono<DocumentDto> create(@RequestBody DocumentDto documentDto) {
        return crptApiService.requestCreateDocument(documentDto);
    }
}
