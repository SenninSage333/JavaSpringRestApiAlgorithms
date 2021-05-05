package io.github.SenninSage333.SAP.model;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();

    Task save(Task entity);
}
