package org.esdpracticals.yummyrest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProductResponse(
        @JsonProperty("product_name")
        String productName,
        @JsonProperty("price")
        Double price
) {
}
