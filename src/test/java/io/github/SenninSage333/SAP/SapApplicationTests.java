package io.github.SenninSage333.SAP;

import io.github.SenninSage333.SAP.controller.AlgorithmsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SapApplicationTests {

    @Autowired
    private AlgorithmsController algorithmsController;

    @Test
    void contextLoads() throws Exception {
        assertThat(algorithmsController).isNotNull();
    }

}
