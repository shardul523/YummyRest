package org.esdpracticals.yummyrest.dto;

import jakarta.validation.constraints.*;

public record CustomerLoginRequest(
        @NotNull(message = "Email field must be given")
        @Email(message = "Email must be in email format")
        String email,

        @NotNull(message = "Password should be present")
        @NotEmpty(message = "Password should be present")
        @NotBlank(message = "Password should be present")
        String password
) {
}
