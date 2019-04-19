package docker.com.example.dockerDemo.Persistance;

import docker.com.example.dockerDemo.tables.CassandraUsersTable;
import org.springframework.data.cassandra.repository.CassandraRepository;

/*
public interface UserCassandraRepository extends CrudRepository<CassandraUsersTable, Integer> {

}*/
public interface UserCassandraRepository extends CassandraRepository<CassandraUsersTable, Long> {

}