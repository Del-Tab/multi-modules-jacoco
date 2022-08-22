package daumer.alban.experimental.jacoco.multimodule.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DumbMainServiceTest {

    @Test
    void callMethod() {
        assertNotNull(DumbMainService.getMessage());
    }
}