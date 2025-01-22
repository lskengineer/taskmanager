package com.example.taskmanager;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping
    public String getAllTasks() {
        return "Task List";
    }
}

