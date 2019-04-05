package docker.com.example.dockerDemo.factory;

import org.springframework.context.annotation.*;

@Configuration
public class ConditonalDataBaseConfig {


    @Bean
    @Conditional(CassandraCondition.class)
    DataBaseFactory ServiceCQL() {
        return new CassandraFactory();
    }


    @Bean
    @Conditional(SQLCondition.class)
    DataBaseFactory ServiceSQL() {
        return new SQLFactory();
    }

}
