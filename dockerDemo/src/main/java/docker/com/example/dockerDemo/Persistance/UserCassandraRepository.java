package docker.com.example.dockerDemo.Persistance;

import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.data.repository.CrudRepository;

public interface UserCassandraRepository extends CrudRepository<CassandraUsersTable, Integer> {

}