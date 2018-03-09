package com.yellowmine.projectservice.repository;


import com.yellowmine.projectservice.entity.Project;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "projects", path = "projects")
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long>{

    List<Project> findById(@Param("id") Long id);

}
