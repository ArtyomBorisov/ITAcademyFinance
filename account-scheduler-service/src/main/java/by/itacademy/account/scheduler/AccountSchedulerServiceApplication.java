package by.itacademy.account.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "by.itacademy.account.scheduler.repository.api")
public class AccountSchedulerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountSchedulerServiceApplication.class, args);
    }
}
