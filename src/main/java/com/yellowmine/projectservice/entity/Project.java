package com.yellowmine.projectservice.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "project")
public class Project implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "name")
    private String projectName;

    @Column(name = "tasks")
    private List<Task> taskList;

    @Column(name = "members")
    private List<String> members;

    @Column(name = "description")
    private String description;


    public Project() {
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
