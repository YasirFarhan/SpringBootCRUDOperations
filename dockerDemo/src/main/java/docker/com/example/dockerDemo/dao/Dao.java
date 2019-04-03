package docker.com.example.dockerDemo.dao;

import docker.com.example.dockerDemo.entity.*;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface Dao extends CassandraRepository<SimpleTable, Integer> {

}
