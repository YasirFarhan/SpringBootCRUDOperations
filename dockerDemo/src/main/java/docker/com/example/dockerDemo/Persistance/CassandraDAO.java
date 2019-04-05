package docker.com.example.dockerDemo.Persistance;

import docker.com.example.dockerDemo.tables.UsersTable;
import org.springframework.data.repository.CrudRepository;

public interface CassandraDAO extends CrudRepository<UsersTable, Integer> {

}