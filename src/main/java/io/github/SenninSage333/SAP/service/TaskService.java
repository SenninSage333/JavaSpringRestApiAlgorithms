package io.github.SenninSage333.SAP.service;

import io.github.SenninSage333.SAP.model.Task;
import io.github.SenninSage333.SAP.model.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task save(Task source) {
        return taskRepository.save(source);
    }
}
