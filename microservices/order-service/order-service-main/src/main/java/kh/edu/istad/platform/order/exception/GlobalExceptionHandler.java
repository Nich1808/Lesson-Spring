
package kh.edu.istad.platform.order.exception;

import kh.edu.istad.platform.order.client.exception.DownStreamServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(DownStreamServiceException.class)
  public ResponseEntity<?> handle(DownStreamServiceException ex) {

    return ResponseEntity
            .status(HttpStatus.BAD_GATEWAY)
            .body(Map.of(
                    "message", "Downstream Service Error",
                    "detail", ex.getMessage(),
                    "service", ex.getService()
            ));
  }
}
