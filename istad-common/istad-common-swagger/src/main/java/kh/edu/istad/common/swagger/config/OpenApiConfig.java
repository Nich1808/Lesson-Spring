package kh.edu.istad.common.swagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.autoconfigure.AutoConfiguration;


@AutoConfiguration
@OpenAPIDefinition(
        info = @Info(
                title = "SAM SREYNICH",
                description = "ISTAD is best",
                version = "1.0.0"
        )
)

public class OpenApiConfig {
}
