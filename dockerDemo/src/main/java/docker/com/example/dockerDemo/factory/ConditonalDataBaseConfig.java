package docker.com.example.dockerDemo.factory;

import docker.com.example.dockerDemo.service.User;
import docker.com.example.dockerDemo.service.ServiceImplCQl;
import docker.com.example.dockerDemo.service.ServiceSQL;
import org.springframework.context.annotation.*;

@Configuration
public class ConditonalDataBaseConfig {


    @Bean
    @Conditional(CqlCondition.class)
    User ServiceCQL() {
        return new ServiceImplCQl();
    }


    @Bean
    @Conditional(SQLCondition.class)
    User ServiceSQL() {
        return new ServiceSQL();
    }

}
