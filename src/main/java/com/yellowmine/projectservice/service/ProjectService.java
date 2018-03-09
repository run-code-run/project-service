package com.yellowmine.projectservice.service;

import com.yellowmine.projectservice.entity.Project;

import java.util.List;

public interface ProjectService {


    List<Project> findAllProjects();

    Project findProjectById(Long id);


}
