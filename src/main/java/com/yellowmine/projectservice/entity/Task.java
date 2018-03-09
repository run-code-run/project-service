package com.yellowmine.projectservice.entity;


import com.yellowmine.projectservice.entity.enums.TaskPriority;
import com.yellowmine.projectservice.entity.enums.TaskStatus;
import com.yellowmine.projectservice.entity.enums.TaskType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String taskName;

    @Column(name = "description")
    private String taskDescription;

    @Column(name = "author")
    private String taskAuthor;

    @Column(name = "executor")
    private String taskExecutor;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TaskType taskType;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @Column(name = "priority")
    @Enumerated(EnumType.STRING)
    private TaskPriority taskPriority;

    @Column(name = "created")
    private Date taskCreationTime;

    @Column(name = "updated")
    private Date taskUpdateTime;


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskAuthor() {
        return taskAuthor;
    }

    public void setTaskAuthor(String taskAuthor) {
        this.taskAuthor = taskAuthor;
    }

    public String getTaskExecutor() {
        return taskExecutor;
    }

    public void setTaskExecutor(String taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public Date getTaskCreationTime() {
        return taskCreationTime;
    }

    public void setTaskCreationTime(Date taskCreationTime) {
        this.taskCreationTime = taskCreationTime;
    }

    public Date getTaskUpdateTime() {
        return taskUpdateTime;
    }

    public void setTaskUpdateTime(Date taskUpdateTime) {
        this.taskUpdateTime = taskUpdateTime;
    }

    public Task() {
    }
}
