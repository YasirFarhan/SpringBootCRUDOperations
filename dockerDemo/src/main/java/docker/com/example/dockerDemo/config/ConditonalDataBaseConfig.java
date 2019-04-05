package docker.com.example.dockerDemo.config;

import docker.com.example.dockerDemo.service.Service;
import docker.com.example.dockerDemo.service.ServiceImplCQl;
import docker.com.example.dockerDemo.service.ServiceSQL;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
public class ConditonalDataBaseConfig {


    @Bean
    @Conditional(CqlCondition.class)
    Service ServiceCQL() {
        return new ServiceImplCQl();
    }


    @Bean
    @Conditional(SQLCondition.class)
    Service ServiceSQL() {
        return new ServiceSQL();
    }

}
