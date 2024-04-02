package org.selsup.crptapi.domain.dto.crpt_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * P.S. взял на себя смелость изменить вашу JSON'ину
 */
@Data
public class DocumentDto {
    private Description description;
    private String doc_id;
    private String doc_status;
    private String doc_type;
    private Boolean importRequest;
    private String owner_inn;
    private String participant_inn;
    private String producer_inn;
    private String production_date;
    private String production_type;
    private List<Product> products;
    private String reg_date;
    private String reg_number;

    @Data
    public static class Description {
        private String participantInn;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public static class Product {
        private String certificate_document;
        private String certificate_document_date;
        private String certificate_document_number;
        private String owner_inn;
        private String producer_inn;
        private String production_date;
        private String tnved_code;
        private String uit_code;
        private String uitu_code;
    }
}

