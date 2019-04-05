package docker.com.example.dockerDemo.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class SQLCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "donotallow".equalsIgnoreCase(context.getEnvironment().getProperty("use.cql"));
    }
}
