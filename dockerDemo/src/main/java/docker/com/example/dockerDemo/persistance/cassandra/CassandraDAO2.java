package docker.com.example.dockerDemo.persistance.cassandra;

import docker.com.example.dockerDemo.entity.SimpleTable;
import org.springframework.data.repository.CrudRepository;

public interface CassandraDAO2 extends CrudRepository<SimpleTable,Integer> {
}
