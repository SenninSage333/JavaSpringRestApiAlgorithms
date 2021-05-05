package io.github.SenninSage333.SAP.controller;

import io.github.SenninSage333.SAP.Algorithms;
import io.github.SenninSage333.SAP.model.Task;
import io.github.SenninSage333.SAP.service.TaskService;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AlgorithmsController {

    private Algorithms algorithms;
    private TaskService taskService;

    public AlgorithmsController(TaskService taskService) {
        this.taskService = taskService;
        this.algorithms = new Algorithms();
    }

    @GetMapping(value = "/task1/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task1(@PathVariable("int") int i) {
        String output = this.algorithms.toBinaryFromDecimal(i);
        Task source = new Task("convert int to binary and return", i, output);
        taskService.save(source);
        String result = new JSONObject().put("result", output).toString();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/task2/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task2(@PathVariable("int") int i) {
        String output = this.algorithms.switchDigitsAndReturnOctal(i);
        Task source = new Task("convert int to binary, switch digits (1 to 0 and 0 to 1), return in octal", i, output);
        taskService.save(source);
        String result = new JSONObject().put("result", output).toString();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/task3/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task3(@PathVariable("int") int i) {
        String output = this.algorithms.reverseDigitsAndReturnHex(i);
        Task source = new Task("convert int to binary, reverse digits (e.g. 100 to 001), return in hex", i, output);
        taskService.save(source);
        String result = new JSONObject().put("result", output).toString();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/task4/{int}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> task4(@PathVariable("int") int i) {
        String output = this.algorithms.MoveDigitsAndReturnDecimal(i);
        Task source = new Task("convert int to binary, move digits (1s to left, 0s to right), return in decimal", i, output);
        taskService.save(source);
        String result = new JSONObject().put("result", output).toString();
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Task>> getAllTasks() {
        List<Task> allTasks = taskService.findAll();
        return ResponseEntity.ok(allTasks);
    }
}
