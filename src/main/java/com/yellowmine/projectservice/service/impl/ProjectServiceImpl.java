package com.yellowmine.projectservice.service.impl;

import com.yellowmine.projectservice.entity.Project;
import com.yellowmine.projectservice.repository.ProjectRepository;
import com.yellowmine.projectservice.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {


    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project findProjectById(Long id) {
        return null;
    }
}
