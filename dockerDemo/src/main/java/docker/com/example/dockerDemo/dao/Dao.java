package docker.com.example.dockerDemo.dao;

import docker.com.example.dockerDemo.entity.*;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;

/*public interface Dao extends CassandraRepository<SimpleTable, Integer> {

}*/
public interface Dao extends CrudRepository<SimpleTable, Integer> {

}