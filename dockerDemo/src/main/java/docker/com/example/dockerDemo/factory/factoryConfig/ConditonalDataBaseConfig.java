package docker.com.example.dockerDemo.factory.factoryConfig;

import docker.com.example.dockerDemo.factory.CassandraFactory;
import docker.com.example.dockerDemo.factory.UsersDAO;
import docker.com.example.dockerDemo.factory.PostgreFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditonalDataBaseConfig {

    @Bean
    @Conditional(SQLCondition.class)
    UsersDAO ServiceSQL() {
        return new PostgreFactory();
    }

    @Bean
    @Conditional(CassandraCondition.class)
    UsersDAO ServiceCQL() {
        return new CassandraFactory();
    }

}
