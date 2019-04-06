package docker.com.example.dockerDemo.config;

import docker.com.example.dockerDemo.factory.CassandraFactory;
import docker.com.example.dockerDemo.factory.DataBaseFactory;
import docker.com.example.dockerDemo.factory.PostgreSqlFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditonalDataBaseConfig {

    @Bean
    @Conditional(SQLCondition.class)
    DataBaseFactory ServiceSQL() {
        return new PostgreSqlFactory();
    }

    @Bean
    @Conditional(CassandraCondition.class)
    DataBaseFactory ServiceCQL() {
        return new CassandraFactory();
    }

}
