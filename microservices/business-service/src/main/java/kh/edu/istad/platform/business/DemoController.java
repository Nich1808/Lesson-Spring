package kh.edu.istad.platform.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    public Map<String, Object> getBusinessById() {
        return Map.of(
                "id", 1,
                "name", "ISTAD",
                "address", "Phnom Penh",
                "status", "ACTIVE"
        );
    }
}