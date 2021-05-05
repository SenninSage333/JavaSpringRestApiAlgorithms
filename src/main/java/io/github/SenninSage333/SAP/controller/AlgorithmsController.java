package io.github.SenninSage333.SAP.controller;

import io.github.SenninSage333.SAP.Algorithms;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class AlgorithmsController {

    private Algorithms algorithms;

    public AlgorithmsController() {
        this.algorithms = new Algorithms();
    }

    @GetMapping(value = "/task1/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task1(@PathVariable("int") int i) {
        String result = new JSONObject().put("result", this.algorithms.toBinaryFromDecimal(i)).toString();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/task2/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task2(@PathVariable("int") int i) {
        String result = new JSONObject().put("result", this.algorithms.switchDigitsAndReturnOctal(i)).toString();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/task3/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task3(@PathVariable("int") int i) {
        String result = new JSONObject().put("result", this.algorithms.reverseDigitsAndReturnHex(i)).toString();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/task4/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task4(@PathVariable("int") int i) {
        String result = new JSONObject().put("result", this.algorithms.MoveDigitsAndReturnDecimal(i)).toString();
        return ResponseEntity.ok(result);
    }
}
