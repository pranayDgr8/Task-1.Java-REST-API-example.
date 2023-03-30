package com.java_api_crud.kaiburr.repository;

import com.java_api_crud.kaiburr.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {
    List<Task> findBySeverity(int Severity);

    @Query("{assignee:?0 ,fieldName :?1}")

    List<Task> getTasksByAssignee(String assignee);

}
