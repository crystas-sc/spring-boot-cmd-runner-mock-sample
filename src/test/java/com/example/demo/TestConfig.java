package com.example.demo;

import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.demo.TaskService;

@Configuration
@Profile("test")
public class TestConfig {
    @Mock
    TaskService taskService;
    public TestConfig() {
        MockitoAnnotations.openMocks(this); //This is a key
        when(taskService.execute()).thenReturn("Task service from test");
    }

    @Primary
    @Bean
    public TaskService getTaskService(){
        return taskService;
    }
}
