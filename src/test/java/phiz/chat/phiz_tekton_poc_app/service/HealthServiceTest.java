package phiz.chat.phiz_tekton_poc_app.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthServiceTest {

    private final HealthService service = new HealthService();

    @Test
    void shouldReturnUpStatus() {
        String status = service.status();
        assertEquals("UP", status);
    }
}
