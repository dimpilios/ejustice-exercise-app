package pilios.exercise.tasktracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"pilios.exercise.tasktracker"})
public class TaskTrackerApplication {

    public static void main(String[] args){
        SpringApplication taskTrackerApplication = new SpringApplication(TaskTrackerApplication.class);
        taskTrackerApplication.run(args);
    }
}
