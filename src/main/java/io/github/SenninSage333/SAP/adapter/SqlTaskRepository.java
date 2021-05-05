package io.github.SenninSage333.SAP.adapter;

import io.github.SenninSage333.SAP.model.Task;
import io.github.SenninSage333.SAP.model.TaskRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlTaskRepository extends TaskRepository, JpaRepository<Task, Long> {
}
