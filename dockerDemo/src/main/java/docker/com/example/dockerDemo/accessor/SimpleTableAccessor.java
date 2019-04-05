package docker.com.example.dockerDemo.accessor;

import lombok.experimental.Accessors;
import org.springframework.data.cassandra.repository.Query;

@Accessors
public interface SimpleTableAccessor {

    @Query(" ")
    void save();

}
