package docker.com.example.dockerDemo.factory.factoryConfig;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SQLCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "sql".equalsIgnoreCase(context.getEnvironment().getProperty("use.database"));
    }
}
