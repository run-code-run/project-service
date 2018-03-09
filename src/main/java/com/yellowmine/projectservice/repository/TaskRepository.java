package com.yellowmine.projectservice.repository;

import com.yellowmine.projectservice.entity.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {
}
