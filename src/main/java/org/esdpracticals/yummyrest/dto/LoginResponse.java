package org.esdpracticals.yummyrest.dto;

import jakarta.validation.constraints.NotNull;

public record LoginResponse(
        @NotNull
        Boolean authenticated,
        String token
) {
}
