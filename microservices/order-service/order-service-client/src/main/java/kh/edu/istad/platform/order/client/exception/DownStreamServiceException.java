
package kh.edu.istad.platform.order.client.exception;

import lombok.Getter;

@Getter
public class DownStreamServiceException extends RuntimeException {

    private final String service;

    public DownStreamServiceException(String service, String message) {
        super(message);
        this.service = service;
    }

    public DownStreamServiceException(
            String service,
            String message,
            Throwable cause
    ) {
        super(message, cause);
        this.service = service;
    }
}
