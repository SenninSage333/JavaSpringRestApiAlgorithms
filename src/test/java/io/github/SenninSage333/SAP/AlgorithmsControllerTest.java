package io.github.SenninSage333.SAP;

import io.github.SenninSage333.SAP.controller.AlgorithmsController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = AlgorithmsController.class)
public class AlgorithmsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getNumberInBinaryString_whenIntegerGiven() throws Exception {
        mockMvc.perform(get("/api/task1/55").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value("110111"));
    }

    @Test
    public void getSwitchedDigitsReturnedInOctal_whenIntegerGiven() throws Exception {
        mockMvc.perform(get("/api/task2/55").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value("10"));
    }

    @Test
    public void getReversedDigitsReturnedInHex_whenIntegerGiven() throws Exception {
        mockMvc.perform(get("/api/task3/55").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value("3B"));
    }

    @Test
    public void getMovedDigitsReturnedInDecimal_whenIntegerGiven() throws Exception {
        mockMvc.perform(get("/api/task4/55").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value("62"));
    }
}
